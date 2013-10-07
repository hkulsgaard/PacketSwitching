package packetswitching;

public class Packet {

//ATRIBUTOS
    
    String _id;
    int _time;
    int _size;
    Nodo _source;
    Nodo _destination;
    
//CONSTRUCTOR
    public Packet (String id, int time, int size, Nodo source, Nodo destination){
        _id = id;
        _time = time;
        _size = size;
        _source = source;
        _destination = destination;
    }
    
//GETTS AND SETTERS
    public String getId(){return _id;}
    public int getTime(){return _time;}
    public int getSize(){return _size;}
    public Nodo getSource(){return _source;}
    public Nodo getDestination(){return _destination;}
    
    public void setTime(int time){_time = time;}
    
}

