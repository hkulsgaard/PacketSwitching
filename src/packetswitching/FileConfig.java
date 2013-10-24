package packetswitching;

import java.util.Vector;

public class FileConfig {
    
//ATRIBUTOS
    
    
//CONSTRUCTOR
    public void FileConfig (){}

    
//METODOS
    //Carga en el programa una configuracion de red desde un archivo
    public Vector<Nodo> loadFromFile(String filepath){
        Vector<Nodo> network = new Vector();
        int start = 1;
        int end = 0;
        String item;
        String item2;
        String endofline = ".";
        String separator = ",";
        String intermediator = "_";
        String linkto = "-";
        String line = "LA PUTA MADRE";
        //Se procedera a leer cada linea del archivo
        
        //line = file.first_line;
        
        //La primera corresponde a los Nodos individuales
        String nodos = "Nodos:";
        String channels = "Channels:";
        String packets = "Packets:";
        start = nodos.length();
        while(!line.substring(start, start).contentEquals(endofline)){
            end = line.indexOf(separator,start);
            item = line.substring(start, end);
            Nodo new_nodo = new Nodo(item);
            network.add(new_nodo);
            start = end;
        }
                while(!line.substring(start, start).contentEquals(endofline)){
            end = line.indexOf(separator);

        //line = file.next_line;
        
        start = channels.length();
        end = 0;
        
        //La segunda parte carga los canales entre los nodos
        while(!line.substring(start, start).contentEquals(endofline)){
            end = line.indexOf(linkto);
            item = line.substring(start, end);
            start = end;
            end = line.indexOf(separator,start);
            item2 = line.substring(start+1, end);
            for(int i=0; i<network.size(); i++)
            
        }
    
        return network;
    }
}
