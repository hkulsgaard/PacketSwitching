package packetswitching;

import java.util.Vector;

public class RoutingTable {
    
//ATRIBUTOS
    
    private static RoutingTable _instance = null;
    private static Vector<Vector<Nodo>> _routing;

    
//CONSTRUCTOR Y SINGLETON INSTANCE
    protected RoutingTable (){}
    
    public static RoutingTable getInstance()
    {
        if (_instance == null){
            _instance = new RoutingTable();
            _routing = new Vector<Vector<Nodo>>();
        }
        
        return _instance;
    }
    
    
//METODOS PUBLICOS
    
    public void makeRoutingTable (Vector<Nodo> sources, Vector<Nodo> destinations)
    {
        Vector<Nodo> path;
        for (int i = 0; i < sources.size(); i++)
            for (int j = 0; j < destinations.size(); j++)
            {
                if (sources.elementAt(i).getId() != destinations.elementAt(j).getId())
                {
                    Vector<Nodo> inicial = new Vector<Nodo>();
                    inicial.add(sources.elementAt(i));
                    path = this.getPath(sources.elementAt(i), destinations.elementAt(j), inicial);
                    if (path.size() > 1)
                    _routing.add(path);
                }
            }
    }
    
    public void showRoutingTable ()
    {
        for (int i = 0; i < _routing.size(); i++)
        {
            System.out.println("Ruta de "+_routing.elementAt(i).firstElement().getId()+" a "+_routing.elementAt(i).lastElement().getId());
            for (int j = 0; j < _routing.elementAt(i).size(); j++)
            {
                System.out.println(_routing.elementAt(i).elementAt(j).getId());
            }
        }
    }
    
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
    
    
//METODOS INTERNOS
    
    private boolean contains(Vector<Nodo> path, Nodo target)
    {
        for (int i = 0; i < path.size(); i++)
        {
            if (path.elementAt(i).getId().equals(target.getId()))
                return true;
        }
        return false;
    }
        
    private Vector<Nodo> getPath(Nodo nodoactual, Nodo destino, Vector<Nodo> pathactual)
    {
        if (nodoactual.getId().equals(destino.getId()))
        {
            return pathactual;
        }
       
        Vector<Nodo> auxpath;
        Vector<Nodo> auxpath2;
        Vector<Channel> _channels = nodoactual.getChannels();
        Vector<Nodo> bestpath = new Vector<Nodo>();
        for (int i = 0; i < _channels.size(); i++)
        {
            auxpath = new Vector<Nodo>();
            for (int j = 0; j < pathactual.size(); j++)
                auxpath.add(pathactual.elementAt(j));
            
            if (!(contains(auxpath,_channels.elementAt(i).getDestination())))
            {
                auxpath.add(_channels.elementAt(i).getDestination());
                auxpath2 = getPath(auxpath.lastElement(),destino,auxpath);
                if (bestpath.size() == 0)
                {
                    bestpath = auxpath2;
                }
                else
                {
                    if (auxpath2.size() < bestpath.size() && auxpath2.size() != 0)
                            bestpath = auxpath2;
                }
            }
        }
       
        return bestpath;
    }
    
    
    public boolean existRoute(Nodo origen, Nodo destino)
    {
        for (int i = 0; i < _routing.size(); i++)
        {
            if (_routing.elementAt(i).firstElement().getId() == origen.getId() && _routing.elementAt(i).lastElement().getId() == destino.getId())
               return true;
        }
        System.out.println("No existe un camino del nodo " + origen.getId() + " al nodo " + destino.getId());
        return false;
    }
    
    public Vector<Nodo> getRoute(Nodo origen, Nodo destino)
    {
        for (int i = 0; i < _routing.size(); i++)
        {
            if (_routing.elementAt(i).firstElement().getId() == origen.getId() && _routing.elementAt(i).lastElement().getId() == destino.getId())
               return (Vector)_routing.elementAt(i);
        }
        return null;
    }
    
}
