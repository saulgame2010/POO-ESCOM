import javax.swing.*;
import java.awt.*;

public class Topo {
	public static void main (String [] args) {
	VentanaP p = new VentanaP();
	p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        p.setResizable(false);       
             
        Toolkit vent= Toolkit.getDefaultToolkit();
        Dimension tam= vent.getScreenSize();
        int alto= tam.height;
        int ancho= tam.width;
        System.out.println(alto);
        System.out.println(ancho);
        
        p.setSize(ancho, alto);
        p.setLocation(0, 0);
	}
}