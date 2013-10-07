package packetswitching;

import java.util.Vector;


public class NetworkSimulator {
//ATRIBUTOS
    private Vector<Nodo> _network;
    private RoutingTable _routing;

//CONSTRUCTOR

    public NetworkSimulator() {
        _network = null;
        _routing = RoutingTable.getInstance();
    }
    
    
//METODOS
    
    public void simulate(){
        
        Nodo actual = findNextNodo();
        while(actual != null){
            actual.send();
            actual = findNextNodo();            
        }
    }
    
    public Nodo findNextNodo()
    {
        Nodo next_nodo = null;
        int next_time = -1;
        for (int i=1; i<_network.size(); i++){
            if(_network.elementAt(i).getNextSendTime()!=-1 && (next_time > _network.elementAt(i).getNextSendTime() || next_time == -1)){
                next_nodo = _network.elementAt(i);
                next_time = next_nodo.getNextSendTime();
            }
        }
    }
}
