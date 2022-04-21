import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaP extends JFrame implements ActionListener {
	private JButton [] imagenes;
	private JLabel img;
	private Image [] imagen;
	private ImageIcon [] imgs;
	private JPanel panelImg = new JPanel();
	private JPanel panelMosaico = new JPanel();
	private JLabel completa;
	private Image [] imObtenida;
	private ImageIcon [] imEstablecida;
	Toolkit vent;
	Dimension tam;
	int alto, ancho;

	public VentanaP() {
		this.add(panelMosaico, BorderLayout.WEST);
		panelMosaico.setLayout(new GridLayout(8, 5));
		this.add(panelImg, BorderLayout.EAST);
		panelImg.setLayout(new CardLayout());
		imObtenida = new Image [40];
		imEstablecida = new ImageIcon[40];
		imgs = new ImageIcon[40];
		imagenes = new JButton[40];
		imagen = new Image[40];		
		completa = new JLabel();
		vent= Toolkit.getDefaultToolkit();
        tam= vent.getScreenSize();
        alto= tam.height;
        ancho= tam.width;

		for(int i = 0; i < imgs.length; i++) {
			imagen[i] = new ImageIcon("IMG/img" + i + ".jpg").getImage();
			imgs[i] = new ImageIcon(imagen[i].getScaledInstance((ancho/2)/5, alto/8, Image.SCALE_DEFAULT));
			imagenes[i] = new JButton();
			imagenes[i].addActionListener(this);
			imagenes[i].setIcon(imgs[i]);
			imagenes[i].setMinimumSize(new Dimension(20,20));
			imagenes[i].setMaximumSize(new Dimension(500,600));
			imagenes[i].setPreferredSize(new Dimension((ancho/2)/5, alto/8));

			panelMosaico.add(imagenes[i]);
		}	

		panelImg.add(completa);
		this.setTitle("Mosaico de Imagenes");
	}

	public void actionPerformed(ActionEvent e) {
		JButton x = (JButton) e.getSource();		
		int i;
		for(i = 0; i < imagenes.length; i++) {
			if(x == imagenes[i]) {
				imObtenida[i] = new ImageIcon("IMG/img" + i + ".jpg").getImage();
				imEstablecida[i] = new ImageIcon(imObtenida[i].getScaledInstance((ancho/2),
				 468, Image.SCALE_DEFAULT));
				break;
			}			
		}
		completa.setIcon(imEstablecida[i]);
	}
}