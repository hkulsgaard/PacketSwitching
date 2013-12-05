package packetswitching;

public class Packet {

//ATRIBUTOS
    
    String _id;
    float _time;
    float _size;
    Nodo _source;
    Nodo _destination;
    
//CONSTRUCTOR
    public Packet (String id, float time, float size, Nodo source, Nodo destination){
        _id = id;
        _time = time;
        _size = size;
        _source = source;
        _destination = destination;
    }
    
//GETTS AND SETTERS
    public String getId(){return _id;}
    public float getTime(){return _time;}
    public float getSize(){return _size;}
    public Nodo getSource(){return _source;}
    public Nodo getDestination(){return _destination;}
    
    public void setTime(float time){_time = time;}
    
}