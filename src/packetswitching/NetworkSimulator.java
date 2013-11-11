package packetswitching;

import java.io.IOException;
import java.util.Vector;


public class NetworkSimulator {
//ATRIBUTOS
    private Vector<Nodo> _network;
    private Vector<Nodo> _sources;
    private Vector<Nodo> _destinations;
    
    private RoutingTable _routing;
    private Log _log;

//CONSTRUCTOR

    public NetworkSimulator(String path) throws IOException {
        _network = new Vector<Nodo>();
        _sources = new Vector<Nodo>();
        _destinations = new Vector<Nodo>();
        
        _routing = RoutingTable.getInstance();
        _log = Log.getInstance();
        
        FileConfig file = new FileConfig();
        file.loadFromFile(path,this);
    }
    
//GETS AND SETS
    
    public void setLogPath(String path){
        _log.setPath(path);
    }
    
    public Vector<Nodo> getNetwork(){
        return _network;
    }
    
//ADDS
    
    public void addNodo(String id){
        Nodo newnodo = new Nodo(id);
        _network.add(newnodo);
        System.out.println("+Nodo "+id+" agregado a la red.");
    }
    
    public void addChannel(String id1, String id2, int tr){
        int index = 0;
        Nodo source = null, destination = null;
        while(index < _network.size() && (source == null || destination == null)){
            if(source == null && _network.elementAt(index).getId().equals(id1)){
                source = _network.elementAt(index);
            }
            else if(destination == null && _network.elementAt(index).getId().equals(id2)){
                destination = _network.elementAt(index);
            }
            index++;
        }
        source.createChannelWith(destination, tr);
        System.out.println("+Channel de "+source.getId()+" a "+destination.getId()+" agregado a la red.");
    }
    
    public void addPacket(String id1, String id2, int size){
        
        int index = 0;
        Nodo source = null, destination = null;
        while(index < _network.size() && (source == null || destination == null)){
            if(source == null && _network.elementAt(index).getId().equals(id1)){
                source = _network.elementAt(index);
            }
            else if(destination == null && _network.elementAt(index).getId().equals(id2)){
                destination = _network.elementAt(index);
            }
            index++;
        }
        source.makePackaging(size, destination);
        _sources.add(source);
        _destinations.add(destination);
        System.out.println("+Packet de tamaño "+size+ " de "+source.getId()+" a "+destination.getId()+" agregado a la red.");
    }
    
//METODOS
    
    public void simulate()throws IOException{
        
        _routing.makeRoutingTable(_sources,_destinations);
        Nodo actual = findNextNodo();
        
        while(actual != null){
            actual.send();
            actual = findNextNodo();            
        }
        
        _log.dumpToFile();
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
}
