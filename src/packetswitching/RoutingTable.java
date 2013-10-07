package packetswitching;

import java.util.Vector;

public class RoutingTable {
    
//ATRIBUTOS
    
    private static RoutingTable _instance = null;
    private Vector<Vector<Nodo>> _routing;

//CONSTRUCTOR Y SINGLETON INSTANCE
    protected RoutingTable (){}
    
    public RoutingTable getInstance()
    {
        if (_instance == null)
        {
            _instance = new RoutingTable();
            //**METER EL BACKTRACKING
        }
        
        return _instance;
    }
    
//METODOS
    //Se obtiene el nodo siguiente al "actual" segun el path correspondiente al "source"
    public Nodo getNextNodo(Nodo source, Nodo destination, Nodo actual)
    {
        int index = 0;
        Vector<Nodo> path = null;
        while (index < _routing.size() && path == null)
        {
            if (_routing.elementAt(index).firstElement().equals(source) && _routing.elementAt(index).lastElement().equals(destination))
            {
                path = _routing.elementAt(index);
            }
            
            index++;
        }
        
        return path.elementAt(path.indexOf(actual) + 1);       
    }
    
}
