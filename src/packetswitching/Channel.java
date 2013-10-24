package packetswitching;

public class Channel {

//ATRIBUTOS    
    Nodo _source;
    Nodo _destination;
    int _dp;
    int _tr; 

//CONSTRUCTOR    
    public Channel(Nodo nodo1, Nodo nodo2, int tr) 
    { 
        _source = nodo1;
        _destination = nodo2;
        _tr = tr;//unidad: kilobytes por segundo 
        _dp = 2;//**ARREGLAR PUNTO FLOTANTE _tr / 8192;//(8192 = 1024*8) tiempo de demora hasta que se transfiere el primer bit
    }
    
//GETTERS    
    public Nodo getSource(){return _source;}
    public Nodo getDestination(){return _destination;}
    public int getDp(){return _dp;}
    public int getTr(){return _tr;}
}
