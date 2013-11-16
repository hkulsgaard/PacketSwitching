package packetswitching;

public class Channel {

//ATRIBUTOS    
    Nodo _source;
    Nodo _destination;
    int _dp;
    int _tr; 

//CONSTRUCTOR    
    public Channel(Nodo nodo1, Nodo nodo2, int tr, int dp) 
    { 
        _source = nodo1;
        _destination = nodo2;
        _tr = tr;//unidad: kilobytes por segundo 
        _dp = dp;//demora de propagación
    }
    
//GETTERS    
    public Nodo getSource(){return _source;}
    public Nodo getDestination(){return _destination;}
    public int getDp(){return _dp;}
    public int getTr(){return _tr;}
}
