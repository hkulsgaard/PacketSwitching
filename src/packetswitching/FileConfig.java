package packetswitching;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class FileConfig {
    
//ATRIBUTOS
    NetworkSimulator _ns;
    
//CONSTRUCTOR
    public void FileConfig (){}

    
//METODOS
    //Carga en el programa una configuracion de red desde un archivo
    public NetworkSimulator loadFromFile(String filepath) throws IOException {
        
        FileReader filereader = new FileReader(filepath);
        BufferedReader bufferedreader = new BufferedReader(filereader);
        String line = bufferedreader.readLine();
        
        _ns = new NetworkSimulator();
        int start = 1;
        int end = 0;
        String item;
        String item2;
        int integer;
        String endofline = ".";
        String separator = ",";
        String intermediator = "_";
        String linkto = ">";
        boolean nextline = false;
        //Se procedera a leer cada linea del archivo
        
        String nodos = "Nodos:";
        String channels = "Channels:";
        String packets = "Packets:";
        
        //Captura de nodos
        start = nodos.length();
        System.out.println(line);
        while(!nextline /*&& !line.substring(start, start+1).contentEquals(endofline)*/){
            end = line.indexOf(separator,start);
            if (end == -1) {
                end = line.indexOf(endofline,start);
                nextline = true;
            }
            item = line.substring(start, end);
            System.out.println(item);
            _ns.addNodo(item);
            start = end+1;
        }
        line = bufferedreader.readLine();
        
        start = channels.length();
        end = 0;
        nextline = false;
        System.out.println(line);
        
        //Captura de canales
        while(!nextline/*!line.substring(start, start+1).contentEquals(endofline)*/){
            end = line.indexOf(linkto,start);
            item = line.substring(start, end);
            System.out.println(item);
            
            start = end+1;
            end = line.indexOf(intermediator,start);
            item2 = line.substring(start, end);
            System.out.println(item2);
            
            start = end+1;
            end =  line.indexOf(separator, start);
            if (end == -1) {
                end = line.indexOf(endofline,start);
                nextline = true;
            }
            integer = Integer.valueOf(line.substring(start, end));
            System.out.println(line.substring(start, end));
            
            _ns.addChannel(item,item2,integer);
            start = end+1;                
        }
        
        line = bufferedreader.readLine();
        
        start = packets.length();
        end = 0;
        nextline = false;
        System.out.println(line);
       
        //Captura de paquetes a enviar
        while(!nextline){
            end = line.indexOf(linkto,start);
            item = line.substring(start, end);
            System.out.println(item);
            
            start = end+1;
            end = line.indexOf(intermediator,start);
            item2 = line.substring(start, end);
            System.out.println(item2);
            
            start = end+1;
            end =  line.indexOf(separator, start);
            if (end == -1) {
                end = line.indexOf(endofline,start);
                nextline = true;
            }
            
            integer = Integer.valueOf(line.substring(start, end));
            System.out.println(integer);
            
            _ns.addPacket(item,item2,integer);
            start = end+1;                
        }
        
        return _ns;
    }
}
