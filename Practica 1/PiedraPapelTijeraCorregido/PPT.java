//package PiedraPapelTijera;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PPT {
	
	public static void main(String [] args){
		Piedrotas p = new Piedrotas();
		p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        p.setResizable(false);       
        
        
        
        Toolkit vent= Toolkit.getDefaultToolkit();
        Dimension tam= vent.getScreenSize();
        int alto= tam.height;
        int ancho= tam.width;
        System.out.println(alto);
        System.out.println(ancho);
        
        p.setSize(683, 500);
        p.setLocation(384, 130);
	}

}
/*if(ganador[0][0] || ganador[1][1] || ganador[2][2]) {
                        msj.setText("EMPATE!");
                }
                else if(ganador[0][1] || ganador[1][2] || ganador[2][0]) {
                        msj.setText("PERDISTE!!");
                }
                else if(ganador[0][2] || ganador[1][0] || ganador[2][1]) {
                        msj.setText("GANASTE!!");
                }*/