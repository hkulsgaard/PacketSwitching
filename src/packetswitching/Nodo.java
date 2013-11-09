package packetswitching;

//notebook
import java.util.Vector;

public class Nodo
{
//ATRIBUTOS
    
    String _id;
    Vector<Packet> _packets;
    Vector<Channel> _channels;
    int _sendingtime;
    int _receivingtime;

//ATRIBUTOS CON SINGLETON
    
    RoutingTable _routing;
    Log _log;
   
//SETTERS AND GETTERS
    
    public String getId(){return _id;}
    public int getSendingtime(){return _sendingtime;}
    public int getReceivingtime(){return _receivingtime;}
    public Vector<Channel> getChannels(){return _channels;}
    public int getNextSendTime(){
        if (_packets.isEmpty())
            return -1;
        else
            return _packets.firstElement().getTime();
    }
    
    public void setId(String new_id){_id = new_id;}
    public void setSendingtime(int new_sendingtime){_sendingtime = new_sendingtime;}
    public void setReceivingtime(int new_receivingtime){_receivingtime = new_receivingtime;}
    public void createChannelWith(Nodo destination, int tr){
        _channels.add(new Channel(this,destination,tr));
    }

    
//CONSTRUCTOR
    
    public Nodo(String id)
    {
       _id = id;
       _sendingtime = 0;
       _receivingtime = 0;
       _channels = new Vector();
       _packets = new Vector();
       
       _log = Log.getInstance();
       _routing = RoutingTable.getInstance();
       
    }

//GETS INTERNO
    
    //Se devuelve el channel que conecta al nodo "next" pasado por parametro
    public Channel getChannel(Nodo next)
    {
        Channel channel = null;
        int index = 0;
        while(index < _channels.size() && channel == null)
        {
            if (_channels.elementAt(index).getDestination().equals(next))
                channel = _channels.elementAt(index);
            index++;
        }
        
        return channel;
  }
    
//CHECKS
    
    // Verifica si el nodo esta ocupado recibiendo en el momento t
    public boolean isReceiving(int t)
    {
        if (t < _receivingtime)
            return true;
        return false;
    }
 
    // Verifica si el nodo esta ocupado enviando en el momento t
    public boolean isSending(int t)
    {
        if (t < _sendingtime)
            return true;
        return false;
    }
   
//METODOS
    
    //Envia al destino el primer paquete de la cola de paquetes
    public void send()
    {
        Packet send_packet = _packets.remove(0);
        Nodo next_nodo = _routing.getNextNodo(send_packet.getSource(),send_packet.getDestination(),this);
        Channel channel = getChannel(next_nodo);
        
        int start;
        if (next_nodo.isReceiving(send_packet.getTime())){
            start = next_nodo.getReceivingtime();
        }
        else{
            start = send_packet.getTime();
        }
        
        int transfer = send_packet.getSize() / channel.getTr();
        int stop = start + transfer;
        _sendingtime = stop;
        
        for(int i=0; i<_packets.size(); i++)
        {
            if(_packets.elementAt(i).getTime() < stop){
                _packets.elementAt(i).setTime(stop);
            }
        }
        
        _log.doLog("*Start Send  ",this,next_nodo,send_packet,start);
        //_log.doLog("Start Receive",next_nodo,this,send_packet,start + channel.getDp());
        _log.doLog("Stop Send    ",this,next_nodo,send_packet,stop);
        //_log.doLog("Stop Receive ",next_nodo,this,send_packet,stop + channel.getDp());
        
        send_packet.setTime(stop + channel.getDp());
        next_nodo.receive(send_packet);
              
        return;
    }
    
    //Se realiza la recepcion de un paquete, se lo agrega a la cola de paquetes y se modifica el tiempo en el que el nodo va a estar recibiendo
    public void receive(Packet receive_packet)
    {
        _receivingtime = receive_packet.getTime();
        
        if (!receive_packet.getDestination().equals(this))
            _packets.add(receive_packet);
    }
       
    //Se crean los paquetes necesarios para enviar la cantidad de datos indicados por parametro y se los encolan
    public void makePackaging(int bytes, Nodo destination)
    {        
        int quant_packets = bytes / 100;
        int rest = bytes % 100;
        
        Packet new_packet = null;
        int i;
        for(i = 0; i < quant_packets; i++){
            new_packet = new Packet(_id+"-P"+i,0,100,this,destination);
            _packets.add(new_packet);     
        }     
        
        if (rest != 0){
            new_packet = new Packet(_id+"-P"+i,0,rest,this,destination);
            _packets.add(new_packet);
        }
    }
   
}
