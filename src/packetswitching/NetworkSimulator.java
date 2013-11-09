package packetswitching;

import java.util.Vector;


public class NetworkSimulator {
//ATRIBUTOS
    private Vector<Nodo> _network;
    private RoutingTable _routing;

//CONSTRUCTOR

    public NetworkSimulator() {
        _network = new Vector();
        _routing = RoutingTable.getInstance();
    }
    
//ADDS
    
    public void addNodo(String id){
        Nodo newnodo = new Nodo(id);
        _network.add(newnodo);
        System.out.println("Nodo "+id+" agregado a la red");
    }
    
    public void addChannel(String id1, String id2, int tr){
        int index = 0;
        Nodo source = null, destination = null;
        while((source == null || destination == null) && index < _network.size()){
            if(source == null && _network.elementAt(index).getId().equals(id1)){
                source = _network.elementAt(index);
            }
            else if(source == null && _network.elementAt(index).getId().equals(id2)){
                destination = _network.elementAt(index);
            }
            index++;
        }
        source.createChannelWith(destination, tr);
        System.out.println("Channel de "+id1+" a "+id2+" agregado a la red");
    }
    
    public void addPacket(String id1, String id2, int size){
        int index = 0;
        Nodo source = null, destination = null;
        while((source == null || destination == null) && index < _network.size()){
            if(source == null && _network.elementAt(index).getId().equals(id1)){
                source = _network.elementAt(index);
            }
            else if(source == null && _network.elementAt(index).getId().equals(id2)){
                destination = _network.elementAt(index);
            }
            index++;
        }
        source.makePackaging(size, destination);
        System.out.println("Packet de tamaño "+size+ " de "+source+" a "+destination+" agregado a la red");
    }
    
//METODOS
    
    public void simulate(){
        
        if(_routing == null) _routing.makeRoutingTable(_network);
        Nodo actual = findNextNodo();
        
        while(actual != null){
            actual.send();
            actual = findNextNodo();            
        }
    }
    
    public Nodo findNextNodo(){
        Nodo next_nodo = null;
        int next_time = -1;
        for (int i=0; i<_network.size(); i++){
            if(_network.elementAt(i).getNextSendTime()!=-1 && (next_time > _network.elementAt(i).getNextSendTime() || next_time == -1)){
                next_nodo = _network.elementAt(i);
                next_time = next_nodo.getNextSendTime();
            }
        }
        
        return next_nodo;
    }
    
    
//METODOS DE TEST
    
    public void inic(){
        
        //Vector<Nodo> red1 = new Vector();
        //redes.add(red1);
        Nodo nodoA = new Nodo("Nodo_A");
        //red1.add(nodoA);
        _network.add(nodoA);
        Nodo nodoB = new Nodo("Nodo_B");
        //red1.add(nodoB);
        _network.add(nodoB);
        
        //Vector<Nodo> red2 = new Vector();
        //redes.add(red2);
        Nodo nodoC = new Nodo("Nodo_C");
        //red2.add(nodoC);
        _network.add(nodoC);
        Nodo nodoD = new Nodo("Nodo_D");
       // red2.add(nodoD);
        _network.add(nodoD);
        
        Nodo nodoE = new Nodo("Nodo_E");
        //red1.add(nodoE);
        //red2.add(nodoE);
        _network.add(nodoE);
        
        nodoA.createChannelWith(nodoB, 10);
        nodoB.createChannelWith(nodoE, 20);
        nodoC.createChannelWith(nodoD, 12);
        nodoD.createChannelWith(nodoE, 10);
        
        nodoA.makePackaging(200, nodoE);
        nodoC.makePackaging(300, nodoE);
        
        _routing.makeRoutingTable(_network);
        
        //_routing.inic(redes);
    }
}
