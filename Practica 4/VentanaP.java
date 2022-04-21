import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaP extends JFrame implements ActionListener{

	private JPanel panelMosaico = new JPanel();
	private JPanel panelImg = new JPanel();
	private JButton [] imagenesB;
	private Image imagen, imagenT;
	private ImageIcon imgsT, imgs;	
	private int score, delay;
	private JLabel scoreL;
	Toolkit vent;
	Dimension tam;
	int alto, ancho;

	public VentanaP() {
		vent= Toolkit.getDefaultToolkit();
        tam= vent.getScreenSize();
        alto= tam.height;
        ancho= tam.width;        
		this.add(panelImg, BorderLayout.NORTH);
		panelImg.setLayout(new CardLayout());
		panelImg.setPreferredSize(new Dimension(ancho, 65));
		this.add(panelMosaico, BorderLayout.SOUTH);
		panelMosaico.setLayout(new GridLayout(4, 5));
		score = 0;
		scoreL = new JLabel("Tu puntuacion es de: " + score);	
		imagenesB = new JButton[20];
		imagen = new ImageIcon("IMG/nose.png").getImage();
		imagenT = new ImageIcon("IMG/topo.jpg").getImage();
		imgsT = new ImageIcon(imagenT.getScaledInstance((ancho/5), (alto/4), Image.SCALE_DEFAULT));
		imgs = new ImageIcon(imagen.getScaledInstance((ancho/5), (alto/4), Image.SCALE_DEFAULT));				
 		panelImg.add(scoreL);
 		limpiarTablero(); 	

 		Runnable runnable = new Runnable() {
			public void run() {
				
				while (true) {
					try {
						Thread.sleep(3000);
						System.out.println("Aqui estoy, soy el hilo");
						limpiarTablero();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread hilo = new Thread(runnable);
		hilo.start();

	}

	public void limpiarTablero() {
		if (panelMosaico.getComponentCount() == 0){
			
			crearTablero();

		} else {
		
		for(int i=0; i<imagenesB.length; i++){
		panelMosaico.remove(imagenesB[i]);
		}
		crearTablero();
	}
}

	public void crearTablero() {
		for(int i = 0; i < imagenesB.length; i++) {
			imagenesB[i] = new JButton();
			imagenesB[i].addActionListener(this);		
			imagenesB[i].setMinimumSize(new Dimension(20,20));
			imagenesB[i].setMaximumSize(new Dimension(500,600));
			imagenesB[i].setPreferredSize(new Dimension(ancho/5, (alto-90)/4));
			float rand = (float) Math.random();
			if(rand < 0.5) {			
				imagenesB[i].setIcon(imgsT);					
				panelMosaico.add(imagenesB[i]);
				imagenesB[i].setName("topo");
			} else {								
				imagenesB[i].setIcon(imgs);				
				panelMosaico.add(imagenesB[i]);
				imagenesB[i].setName("noTopo");
			}
		}
	}

	public void actionPerformed (ActionEvent e) {

		JButton x = (JButton) e.getSource();				
		if(x.getName().equals("topo")){
			score += 10;
			scoreL.setText("Tu puntuacion es de: " + score);
		}				
	}
}