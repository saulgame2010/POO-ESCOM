import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

class Perro extends JFrame implements ActionListener {
	
		JLabel jNom, jRaza, jEdad, jGenero;
		JTextField tNom, tRaza, tEdad, tGenero;
		JButton conectar, insertar;
		String nom, raza, genero;
		int edad;
		boolean conectado;
		Conexion obj;
		Connection cn;

	public Perro () {
		conectado = false;
		obj = new Conexion();
		cn = obj.Conectate();

		this.getContentPane().setLayout(null);
		jNom = new JLabel("Nombre");
		jNom.setBounds(150, 50, 50, 30);
		this.add(jNom);

		jRaza = new JLabel("Raza");
		jRaza.setBounds(150, 100, 50, 30);
		this.add(jRaza);

		jEdad = new JLabel("Edad");
		jEdad.setBounds(150, 150, 50, 30);
		this.add(jEdad);

		jGenero = new JLabel("Genero");
		jGenero.setBounds(150, 200, 50, 30);
		this.add(jGenero);

		tNom = new JTextField();
		tNom.setBounds(300, 50, 80, 20);
		this.add(tNom);

		tRaza = new JTextField();
		tRaza.setBounds(300, 100, 80, 20);
		this.add(tRaza);

		tEdad = new JTextField();
		tEdad.setBounds(300, 150, 80, 20);
		this.add(tEdad);

		tGenero = new JTextField();
		tGenero.setBounds(300, 200, 80, 20);
		this.add(tGenero);

		conectar = new JButton("Conectar");
		conectar.setBounds(150, 300, 100, 20);
		this.add(conectar);

		insertar = new JButton("Insertar");
		insertar.setBounds(300, 300, 80, 20);
		this.add(insertar);
		if(conectado != true) {
			insertar.setEnabled(false);
		}


		nom = ""; raza = ""; genero = "";
		edad = 0;
		this.setTitle("Registro de perros");		

	}	

	public void actionPerformed(ActionEvent e) {
		JButton x = (JButton) e.getSource();
		if(x == conectar) {			

			if(cn!=null){

                JOptionPane.showMessageDialog(null, "Conectado");
                insertar.setEnabled(true);

                try{

                    cn.close();

                }catch(SQLException ex){

                    System.out.println("Error al desconectar "+ex);

                }

        	}
		}
		else if(x == insertar) {
			nom = tNom.getText();
			raza = tRaza.getText();
			edad = Integer.parseInt(tEdad.getText());
			genero = tGenero.getText();
			String inserta = "INSERT INTO Perro" 
			+ "(nombre, raza, edad, genero) VALUES"
			+ "(?, ?, ?, ?)";
			try {
				PreparedStatement ps = cn.prepareStatement(inserta);
				
				ps.setString(1, nom);
				ps.setString(2, raza);
				ps.setInt(3, edad);
				ps.setString(4, genero);

				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Se insertaron los datos en la base");				
			} catch(SQLException ex) {
				JOptionPane.showMessageDialog(null, "Hubo una excepcion: " + ex);
			}
		}
	}
}