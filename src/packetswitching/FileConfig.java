package packetswitching;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class FileConfig {
    
//ATRIBUTOS
    public static final int FAIL_LOAD = 0;
    public static final int SUCCESFUL_LOAD = 1;
    
//CONSTRUCTOR
    public void FileConfig (){}

    
//METODOS
    //Carga en el programa una configuracion de red desde un archivo
    public int loadFromFile(String filepath, NetworkSimulator _ns){
        try{
            System.out.println("Comienzo del cargado del archivo.");
            FileReader filereader = new FileReader(filepath);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            String line = bufferedreader.readLine();

            int start = 1;
            int end = 0;
            String item;
            String item2;
            int integer;
            int integer2;
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
                end =  line.indexOf(intermediator, start);
                try{
                    integer = Integer.valueOf(line.substring(start, end));
                }catch (NumberFormatException ne) {
                    System.err.println("Caught IOException: " + ne.getMessage());
                    return FAIL_LOAD;
                }

                //Demora de propagacion
                start = end+1;
                end =  line.indexOf(separator, start);
                if (end == -1) {
                    end = line.indexOf(endofline,start);
                    nextline = true;
                }
                integer2 = Integer.valueOf(line.substring(start, end));

                //Agregado del channel
                if(_ns.addChannel(item,item2,integer,integer2)==_ns.FAIL_ADD) return FAIL_LOAD;
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
                if(_ns.addPacket(item,item2,integer)==_ns.FAIL_ADD) return FAIL_LOAD;
                start = end+1;
            }

            System.out.println("Fin del cargado del archivo.");System.out.println();
            return SUCCESFUL_LOAD;
            
        }catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
            return FAIL_LOAD;
        }
    }
}
