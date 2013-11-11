package packetswitching;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class FileConfig {
    
//ATRIBUTOS
    
//CONSTRUCTOR
    public void FileConfig (){}

    
//METODOS
    //Carga en el programa una configuracion de red desde un archivo
    public void loadFromFile(String filepath, NetworkSimulator _ns) throws IOException {
        
        System.out.println("Comienzo del cargado del archivo.");
        FileReader filereader = new FileReader(filepath);
        BufferedReader bufferedreader = new BufferedReader(filereader);
        String line = bufferedreader.readLine();
        
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
        while(!nextline){
            end = line.indexOf(separator,start);
            if (end == -1) {
                end = line.indexOf(endofline,start);
                nextline = true;
            }
            item = line.substring(start, end);
            _ns.addNodo(item);
            start = end+1;
        }
        line = bufferedreader.readLine();
        
        start = channels.length();
        end = 0;
        nextline = false;
        
        //Captura de canales
        while(!nextline){
            //Nodo source
            end = line.indexOf(linkto,start);
            item = line.substring(start, end);
            
            //Nodo destination
            start = end+1;
            end = line.indexOf(intermediator,start);
            item2 = line.substring(start, end);
            
            //Transfer rate
            start = end+1;
            end =  line.indexOf(separator, start);
            if (end == -1) {
                end = line.indexOf(endofline,start);
                nextline = true;
            }
            integer = Integer.valueOf(line.substring(start, end));
            
            //Agregado del channel
            _ns.addChannel(item,item2,integer);
            start = end+1;                
        }
        
        line = bufferedreader.readLine();
        
        start = packets.length();
        end = 0;
        nextline = false;
       
        //Captura de paquetes a enviar
        while(!nextline){
            //Nodo source
            end = line.indexOf(linkto,start);
            item = line.substring(start, end);
            
            //Nodo destination
            start = end+1;
            end = line.indexOf(intermediator,start);
            item2 = line.substring(start, end);
            
            //Tamaño paquete
            start = end+1;
            end =  line.indexOf(separator, start);
            if (end == -1) {
                end = line.indexOf(endofline,start);
                nextline = true;
            }
            
            integer = Integer.valueOf(line.substring(start, end));
            
            //Agregado del envio de packets
            _ns.addPacket(item,item2,integer);
            start = end+1;                
        }
        
        System.out.println("Fin del cargado del archivo.");System.out.println();
    }
}
