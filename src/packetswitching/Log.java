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
    Vector<String> log;
    File file;
    PrintWriter writer;

//CONSTRUCTOR Y SINGLETON INSTANCE
    protected Log (){}
    
    public Log getInstance()
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
            file = new File(file_path);
            writer = new PrintWriter(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
    public void doLog(String evento, Nodo sender, Nodo receiver, Packet packet, int time){
        
        String new_line = evento + "," + 
                          time + "," + 
                          sender.getId() + "," + 
                          receiver.getId() + "," + 
                          packet.getId() + "," + 
                          packet.getSize() + 
                          ".";
        
        log.add(new_line);
    }
    
    public void dumpToFile(String file_path){
        
        System.out.println("**Dumping log to file");
        
        inicFile(file_path);
        
        for (int i=0; i < log.size(); i++)
            writer.println(log.elementAt(i));
        writer.close();
    }
}
