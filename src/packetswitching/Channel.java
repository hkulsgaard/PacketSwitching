package packetswitching;

public class Channel {

//ATRIBUTOS    
    Nodo _nodo1;
    Nodo _nodo2;
    int _dp;
    int _tr; 

//CONSTRUCTOR    
    public Channel(Nodo nodo1, Nodo nodo2, int tr) 
    { 
        _nodo1 = nodo1;
        _nodo2 = nodo2;
        _tr = tr;//unidad: kilobytes por segundo 
        _dp = _tr / 8192;//(8192 = 1024*8) tiempo de demora hasta que se transfiere el primer bit
    }
    
//GETTERS    
    public Nodo getNodo1(){return _nodo1;}
    public Nodo getNodo2(){return _nodo2;}
    public int getDp(){return _dp;}
    public int getTr(){return _tr;}
}
