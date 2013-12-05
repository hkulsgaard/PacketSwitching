package packetswitching;

public class Channel {

//ATRIBUTOS    
    Nodo _source;
    Nodo _destination;
    float _dp;
    float _tr; 

//CONSTRUCTOR    
    public Channel(Nodo nodo1, Nodo nodo2, float tr, float dp) 
    { 
        _source = nodo1;
        _destination = nodo2;
        _tr = tr;//unidad: kilobytes por segundo 
        _dp = dp;//demora de propagaciÃ³n
    }
    
//GETTERS    
    public Nodo getSource(){return _source;}
    public Nodo getDestination(){return _destination;}
    public float getDp(){return _dp;}
    public float getTr(){return _tr;}
}