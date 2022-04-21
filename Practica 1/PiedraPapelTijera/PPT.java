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