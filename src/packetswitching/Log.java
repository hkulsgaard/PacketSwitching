package packetswitching;

import java.util.Vector;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Log {
    
//SINGLETON
    private static Log _instance = null;
    
    
//ATRIBUTOS
    private static Vector<LogLine> _log;
    private static String _path;
    private static String _separator = "|";

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
    
    public void inic(){
        _log = new Vector();
    }
    
//GETS AND SETS
    
    public Vector<LogLine> getLogLines(){
        return _log;
    }
    
    public void setPath(String path){
        _path = path;
    }
    
//METODOS

    public void doLog(String evento, Nodo sender, Nodo receiver, Packet packet, float time){
        
        LogLine newLogLine = new LogLine(time,evento,sender.getId(),receiver.getId(),packet.getId(),packet.getSize() + "kb");
        
        boolean flag = false;        
        // Inserto cada linea de log de manera ordenada por tiempo
        for (int i = 0; (i < _log.size()) && (!flag); i++)
        {
            float compare = _log.elementAt(i)._time;
            if (time < compare)
            {
                _log.insertElementAt(newLogLine, i);
                flag = true;
            }
        }
        if (!flag)
        {
            _log.add(newLogLine);
        }
    }
    
    public void printLog(){
        for(int i=0; i<_log.size(); i++){
            LogLine newLogLine = _log.elementAt(i);
            
            String new_line = newLogLine._time + _separator + 
                          newLogLine._evento + _separator + 
                          newLogLine._sender + _separator + 
                          newLogLine._receiver + _separator + 
                          newLogLine._packetId + _separator + 
                          newLogLine._packetSize +
                          ".";
            System.out.println(new_line);
        }
    }
    
    
    public void dumpToFile() throws IOException{
        
        FileWriter file = new FileWriter(_path);
        PrintWriter writer = new PrintWriter(file);
        
        for (int i=0; i < _log.size(); i++){
            LogLine logLine = _log.elementAt(i);
            String line =   logLine._time + _separator + 
                            logLine._evento + _separator + 
                            logLine._sender + _separator + 
                            logLine._receiver + _separator + 
                            logLine._packetId + _separator + 
                            logLine._packetSize +
                            ".";
            writer.println(line);
        }
        writer.close();
        System.out.println("Archivo de log creado en " + _path);
    }

}