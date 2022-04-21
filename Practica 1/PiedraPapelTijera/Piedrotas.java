//package PiedraPapelTijera;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Piedrotas extends JFrame implements ActionListener {
	JButton piedra, papel, tijera;
	JLabel player, cpu, msj, tcpu, tplayer;
	ImageIcon ipiedra, ipapel, itijera, ippt;
	Icon cpiedra, cpapel, ctijera, cppt;	
	int playerStatus, cpuStatus;
	final int WIDTH = 500;

	public Piedrotas() {
		getContentPane().setLayout(null);	
		playerStatus = 0;
		cpuStatus = 0;	

		ipiedra = new ImageIcon("piedra.png");		
		ipapel = new ImageIcon("papel.png");
		itijera = new ImageIcon("tijera.png");
		ippt = new ImageIcon("ppt.png");

		cpiedra = new ImageIcon(ipiedra.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		cpapel = new ImageIcon(ipapel.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		ctijera = new ImageIcon(itijera.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		cppt = new ImageIcon(ippt.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));

		piedra = new JButton();
		piedra.addActionListener(this);
		piedra.setBounds(WIDTH/10, 300, 150, 150);
		piedra.setIcon(cpiedra);

		papel = new JButton();
		papel.addActionListener(this);
		papel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		papel.setBounds((WIDTH/2)+20, 300, 150, 150);
		papel.setIcon(cpapel);

		tijera = new JButton();
		tijera.addActionListener(this);
		tijera.setBounds(WIDTH-15, 300, 150, 150);
		tijera.setIcon(ctijera);

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
		Object x = e.getSource();
		int nose = (int)((Math.random() * 3) + 1);			
		
		if(x == piedra){
			player.setIcon(cpiedra);
			playerStatus = 1;
			//JOptionPane.showMessageDialog(null, "El status es: " + playerStatus);
		}
		else if(x == papel) {
			player.setIcon(cpapel);
			playerStatus = 2;
			//JOptionPane.showMessageDialog(null, "El status es: " + playerStatus);
		}
		else if(x == tijera) {
			player.setIcon(ctijera);
			playerStatus = 3;
			//JOptionPane.showMessageDialog(null, "El status es: " + playerStatus);
		}

		if(nose == 1) {
			cpu.setIcon(cpiedra);
			cpuStatus = 1;
		}
		else if(nose == 2) {
			cpu.setIcon(cpapel);
			cpuStatus = 2;
		}
		else if(nose ==3) {
			cpu.setIcon(ctijera);
			cpuStatus = 3;
		}

		if(playerStatus == cpuStatus) {
			msj.setText("EMPATE!");
		}
		else if((playerStatus == 1 && cpuStatus == 2) || 
			(playerStatus == 2 && cpuStatus == 3) || 
			(playerStatus == 3 && cpuStatus == 1)) {
			msj.setText("Humillado jsjs");
		}
		else if((playerStatus == 2 && cpuStatus == 1) ||
			(playerStatus == 3 && cpuStatus == 2) ||
			(playerStatus == 1 && cpuStatus == 3)) {
			msj.setText("GANASTE, FELICIDADES!");	
		}

	}

}