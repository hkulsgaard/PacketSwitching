
package packetswitching;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.util.Vector;


public class PanelGrafico extends JPanel {
        
        private Vector<Nodo> _network;
        private Vector<LogLine> _log;
        private float _scale;
        private float _scale_multiplier;
        private String _scale_label;
    
        public int getNroNodo(String id)
        {
            for (int i = 0; i < _network.size(); i++)
            {
                if (_network.elementAt(i).getId().equals(id))
                    return i;
            }
            return 0;
        }
    
        public PanelGrafico(Vector<Nodo> red, Vector<LogLine> log, float scale, float scale_multiplier, String scale_label){
            _network = red;
            _log = log;
            _scale = scale;
            _scale_multiplier = scale_multiplier;
            _scale_label = scale_label;
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(1000, 200);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); 
            Graphics2D g2d = (Graphics2D) g.create();

            //int width = getWidth();
            int width = 5000;
            int height = getHeight();
            
            int nro_nodo_origen;
            int nro_nodo_destino;
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
       
            
            // Lineas punteadas (transmision / recepcion)
            float dash[] = { 5 };
            g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 5, dash, 0.0f));
            
            for (int i = 0; i < _network.size(); i++)
            {
                g2d.drawString("Emision:   ",0,(i * height / (_network.size())) + (height / (2 * _network.size())) + 3);
                g2d.drawLine(55, (i * height / (_network.size())) + (height / (2 * _network.size())), width, (i * height / (_network.size())) + (height / (2 * _network.size())));
                g2d.drawString("Recepcion: ",0,(i * height / (_network.size())) + (height / (2 * _network.size())) - 9);
                g2d.drawLine(55, (i * height / (_network.size())) + (height / (2 * _network.size())) - 12 , width, (i * height / (_network.size())) + (height / (2 * _network.size())) - 12);
            }
            
            
            int step = (int) (_scale / _scale_multiplier);
            
            for (int i = 0; i < width ; i = i + step)
            {
                if (_scale_label.equalsIgnoreCase("ms"))
                {
                    g2d.drawString((int)((i) * _scale_multiplier) + _scale_label, i+55 , height - 1);
                }
                else
                {
                    g2d.drawString(((i) * _scale_multiplier)/1000 + _scale_label, i+55 , height - 1);
                }
                g2d.drawLine(i+55, height - 15 , i+55, height - 11);
            }
            
            g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            
            for (int i = 0; i < _log.size(); i++)
            {
                nro_nodo_origen = getNroNodo(_log.elementAt(i)._sender);
                nro_nodo_destino = getNroNodo(_log.elementAt(i)._receiver);
                    if ("*Start Send  ".equals(_log.elementAt(i)._evento))
                    {
                        for (int j = 0; j < _log.size(); j++)
                        {
                            if (_log.elementAt(i)._packetId.equals(_log.elementAt(j)._packetId)&& _log.elementAt(i)._sender.equals(_log.elementAt(j)._sender)&& _log.elementAt(i)._receiver.equals(_log.elementAt(j)._receiver))
                            {
                                switch (_log.elementAt(j)._evento) {
                                    case "Stop Send    ":
                                        a = (int) (_log.elementAt(i)._time * 1000 / _scale_multiplier + 55)  ;
                                        b = (int) (_log.elementAt(j)._time * 1000 / _scale_multiplier + 55) ;
                                        break;
                                    case "Start Receive":
                                        c = (int) (_log.elementAt(j)._time * 1000 / _scale_multiplier + 55) ;
                                        break;
                                    case "Stop Receive ":
                                        d = (int) (_log.elementAt(j)._time * 1000 / _scale_multiplier + 55);
                                        break;
                                }
                            }
                        }
                        
                        // Send
                        g2d.drawLine(a, (nro_nodo_origen * height / (_network.size())) + (height / (2 * _network.size())), b, (nro_nodo_origen * height / (_network.size())) + (height / (2 * _network.size())));
                        
                        // Receive
                        g2d.drawLine(c, (nro_nodo_destino * height / (_network.size())) + (height / (2 * _network.size())) - 12, d, (nro_nodo_destino * height / (_network.size())) + (height / (2 * _network.size())) - 12);
                        
                        // Union
                        g2d.drawLine(a, (nro_nodo_origen * height / (_network.size())) + (height / (2 * _network.size())), c, (nro_nodo_destino * height / (_network.size())) + (height / (2 * _network.size())) - 12);
                        g2d.drawLine(b, (nro_nodo_origen * height / (_network.size())) + (height / (2 * _network.size())), d, (nro_nodo_destino * height / (_network.size())) + (height / (2 * _network.size())) - 12);
                        
                        // Marks
                        g2d.drawLine(a, (nro_nodo_origen * height / (_network.size())) + (height / (2 * _network.size())) + 5, a, (nro_nodo_origen * height / (_network.size())) + (height / (2 * _network.size())) - 5);
                        g2d.drawLine(b, (nro_nodo_origen * height / (_network.size())) + (height / (2 * _network.size())) + 5, b, (nro_nodo_origen * height / (_network.size())) + (height / (2 * _network.size())) - 5);
                        g2d.drawLine(c, (nro_nodo_destino * height / (_network.size())) + (height / (2 * _network.size())) - 17, c, (nro_nodo_destino * height / (_network.size())) + (height / (2 * _network.size())) - 7);
                        g2d.drawLine(d, (nro_nodo_destino * height / (_network.size())) + (height / (2 * _network.size())) - 17, d, (nro_nodo_destino * height / (_network.size())) + (height / (2 * _network.size())) - 7);
                    }
  
                }
            g2d.dispose();
        }
    }
