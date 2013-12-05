package packetswitching;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.JScrollBar;

public class Painter {
    
    
      public Painter(Vector<Nodo> red, float scale, float scale_multiplier, String scale_label) {
                
                JFrame frame = new JFrame();
                frame.setLayout(new BorderLayout());
                frame.setTitle("Packet Switching Graphic");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                JPanel panel_nodos = new JPanel(new GridLayout(red.size(),1));
                for (int i = 0; i < red.size(); i++)
                {
                    panel_nodos.add(new JLabel("  " + red.elementAt(i).getId()+ "  "));
                }

                frame.add(panel_nodos, BorderLayout.WEST);
                
                Vector<LogLine> log = Log.getInstance().getLogLines();   
                
                frame.add(new PanelGrafico(red,log,scale,scale_multiplier,scale_label), BorderLayout.CENTER);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                 BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB);
                 Graphics2D graphics2D = image.createGraphics(); 

                 frame.paint(graphics2D);

                 try{
                     ImageIO.write(image,"jpg", new File("PacketSwitchingTrace.jpg"));
                     }
                 catch(Exception ex){
                      ex.printStackTrace();
                     }
            }
      
      public Painter(String path, float scale, float scale_multiplier, String scale_label) throws IOException
      {

            FileConfig file = new FileConfig();
           
            System.out.println("Comienzo del cargado del archivo.");
            FileReader filereader = new FileReader(path);
            BufferedReader bufferedreader = new BufferedReader(filereader);
           

            String separator = "|";
            String endofline = ".";
            Vector<Nodo> red = new Vector();
            Vector<LogLine> logLines = new Vector();
            String item;
            boolean nextline = false;
            
            for (String line = bufferedreader.readLine(); line != null; line = bufferedreader.readLine())
            {
            int start = 0;
            int end;
            
            end = line.indexOf(separator,start);
            start = end +1;
                
            end = line.indexOf(separator,start);
            start = end +1;

            end = line.indexOf(separator,start);
            item = line.substring(start, end);
            start = end +1;

            boolean enc = false;
            for (int j = 0; j < red.size() && !enc; j++)
            {
                if (red.elementAt(j).getId().equals(item))
                    enc = true;
            }
            if (!enc)
                red.add(new Nodo(item));

            end = line.indexOf(separator,start);
            item = line.substring(start, end);

            enc = false;
            for (int j = 0; j < red.size() && !enc; j++)
            {
                if (red.elementAt(j).getId().equals(item))
                    enc = true;
            }
            if (!enc)
                red.add(new Nodo(item));
            
            start = 0;
            //time
            end = line.indexOf(separator,start);
            float time = Float.parseFloat(line.substring(start, end));
            start = end +1;
            
            //evento
            end = line.indexOf(separator,start);
            String evento = line.substring(start, end);
            start = end +1;
            
            //sender
            end = line.indexOf(separator,start);
            String sender = line.substring(start, end);
            start = end +1;
            
            //receiver
            end = line.indexOf(separator,start);
            String receiver = line.substring(start, end);
            start = end +1;
            
            //packet
            end = line.indexOf(separator,start);
            String packet = line.substring(start, end);
            start = end +1;
            
            //size
            end = line.length();
            String size = line.substring(start, end);
            start = end +1;
            
            logLines.add(new LogLine(time,evento,sender,receiver,packet,size));
            }
          
            JFrame frame = new JFrame();
            frame.setLayout(new BorderLayout());
            frame.setTitle("Packet Switching Graphic");
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            
            JPanel panel_nodos = new JPanel(new GridLayout(red.size(),1));
            for (int i = 0; i < red.size(); i++)
            {
                panel_nodos.add(new JLabel("  " + red.elementAt(i).getId()+ "  "));
            }
            
            frame.add(panel_nodos, BorderLayout.WEST);
            
            frame.add(new PanelGrafico(red,logLines, scale, scale_multiplier, scale_label), BorderLayout.CENTER);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
            BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2D = image.createGraphics(); 
            
            frame.paint(graphics2D);
            
            try{
                ImageIO.write(image,"jpg", new File("PacketSwitchingTrace.jpg"));
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
      }
}