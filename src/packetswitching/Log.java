package packetswitching;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
    
//SINGLETON
    private static Log _instance = null;
    
//ATRIBUTOS
    private static Vector<String> _log;
    private static File _file;
    private static PrintWriter _writer;

//CONSTRUCTOR Y SINGLETON INSTANCE
    protected Log (){}
    
    public static Log getInstance()
    {
        if (_instance == null)
        {
            _instance = new Log();
        }
        
        return _instance;
    }
    
//METODOS
    
    //Se crea el archivo de log
    private void inicFile(String file_path){
        System.out.println("**Creating log file");
        
        try {
            _file = new File(file_path);
            _writer = new PrintWriter(_file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
    /*public void doLog(String evento, Nodo sender, Nodo receiver, Packet packet, int time){
        
        String new_line = evento + " | " + 
                          time + " | " + 
                          sender.getId() + " | " + 
                          receiver.getId() + " | " + 
                          packet.getId() + " | " + 
                          packet.getSize() + 
                          ".";
        
        _log.add(new_line);
    }*/
    
    public void dumpToFile(String file_path){
        
        System.out.println("**Dumping log to file");
        
        inicFile(file_path);
        
        for (int i=0; i < _log.size(); i++)
            _writer.println(_log.elementAt(i));
        _writer.close();
    }
    
    
    //METODOS PARA TEST
    
    public void printLog(){
        for(int i=0; i<_log.size(); i++){
            System.out.println(_log.elementAt(i));
        }
    }
    
    public void doLog(String evento, Nodo sender, Nodo receiver, Packet packet, int time){
        
        String new_line = time + " | " +
                          evento + " | " +  
                          sender.getId() + " | " + 
                          receiver.getId() + " | " + 
                          packet.getId() + " | " + 
                          packet.getSize() + "kb" + 
                          ".";
        
        System.out.println(new_line);
    }
}
