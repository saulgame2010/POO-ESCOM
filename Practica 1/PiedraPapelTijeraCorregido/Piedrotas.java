import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Piedrotas extends JFrame implements ActionListener {
	JButton piedra, papel, tijera;
	JLabel player, cpu, msj, tcpu, tplayer;
	ImageIcon ipiedra, ipapel, itijera, ippt;
	Icon cppt; Icon [] jaja;		
	final int WIDTH = 500;

	public Piedrotas() {
		getContentPane().setLayout(null);	
		jaja = new Icon[3];		
		
		ipiedra = new ImageIcon("piedra.png");		
		ipapel = new ImageIcon("papel.png");
		itijera = new ImageIcon("tijera.png");
		ippt = new ImageIcon("ppt.png");

		jaja[0] = new ImageIcon(ipiedra.getImage().getScaledInstance(150, 150,    Image.SCALE_DEFAULT));
		jaja[1] = new ImageIcon(ipapel.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		jaja[2] = new ImageIcon(itijera.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		cppt = new ImageIcon(ippt.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));

		piedra = new JButton();
		piedra.addActionListener(this);
		piedra.setBounds(WIDTH/10, 300, 150, 150);
		piedra.setIcon(jaja[0]);

		papel = new JButton();
		papel.addActionListener(this);
		papel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		papel.setBounds((WIDTH/2)+20, 300, 150, 150);
		papel.setIcon(jaja[1]);

		tijera = new JButton();
		tijera.addActionListener(this);
		tijera.setBounds(WIDTH-15, 300, 150, 150);
		tijera.setIcon(jaja[2]);

		player = new JLabel();	
		player.setBounds((WIDTH/2)+180, 100, 150, 150);
		player.setIcon(cppt);	
		tplayer = new JLabel("Jugador");
		tplayer.setBounds((WIDTH/2)+218, 200, 100, 100);
		tplayer.setFont(new java.awt.Font("Cooper Black", 0, 14));

		cpu = new JLabel();
		cpu.setBounds((WIDTH/2)-110, 100, 150, 150);
		cpu.setIcon(cppt);	
		tcpu = new JLabel("CPU");
		tcpu.setBounds((WIDTH/2)-63, 200, 100, 100);	
		tcpu.setFont(new java.awt.Font("Cooper Black", 0, 14));

		msj = new JLabel("Bienvenido a piedra, papel o tijeras");	
		msj.setBounds(WIDTH/2-50, 30, 290, 80);	
		msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		msj.setFont(new java.awt.Font("Cooper Black", 0, 16));
	
		//Agregamos los componentes
		getContentPane().add(piedra);
		getContentPane().add(papel);
		getContentPane().add(tijera);
		getContentPane().add(player);
		getContentPane().add(cpu);
		getContentPane().add(msj);
		getContentPane().add(tcpu);
		getContentPane().add(tplayer);

		this.setTitle("Pierda, papel o tijeras");
	}

	public void actionPerformed(ActionEvent e) {
		JButton x = (JButton) e.getSource();
		int nose = (int)(Math.random() * 3);
		cpu.setIcon(jaja[nose]);			
		player.setIcon(x.getIcon());
		
		if((x == piedra && nose == 0) || (x == papel && nose == 1) || (x == tijera && nose == 2)){
			msj.setText("EMPATE!");
		}
		if((x == piedra && nose == 1) || (x == papel && nose == 2) || (x == tijera && nose == 0)){
			msj.setText("PERDISTE!");
		}
		if((x == piedra && nose == 2) || (x == papel && nose == 0) || (x == tijera && nose == 1)){
			msj.setText("GANASTE!");
		}	
	}
}
