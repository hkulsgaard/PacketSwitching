package packetswitching;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.util.Vector;
import javax.imageio.ImageIO;

public class Painter {
    
    
      public Painter(Vector<Nodo> red) {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                
                
                JFrame frame = new JFrame();
                frame.setTitle("Packet Switching's Graphic");
                frame.setLayout(new BorderLayout());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  
                                
                JPanel panel_nodos = new JPanel(new GridLayout(red.size(),1));
                for (int i = 0; i < red.size(); i++)
                {
                    panel_nodos.add(new JLabel("  " + red.elementAt(i).getId()+ "  "));
                }

                frame.add(panel_nodos, BorderLayout.WEST);
                
                frame.add(new PanelGrafico(red), BorderLayout.CENTER);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                 {
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
}
