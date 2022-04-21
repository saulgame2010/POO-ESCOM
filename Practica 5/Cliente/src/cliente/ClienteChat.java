package cliente;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
/**
 *
 * @author saulg
 */

public class ClienteChat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCliente mimarco=new MarcoCliente();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCliente extends JFrame{
	public MarcoCliente(){
		setBounds(600,300,280,350);
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		add(milamina);
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel implements Runnable{
	public LaminaMarcoCliente(){
                usuario = new JTextField(5);
                add(usuario);                
            	JLabel texto=new JLabel("CLIENTE");
		add(texto);
                ip = new JTextField(8);
                add(ip);
                area = new JTextArea(12,20);
                add(area);
		campo1=new JTextField(20);
		add(campo1);		
		miboton=new JButton("Enviar");
	        Enviar evento = new Enviar();
                miboton.addActionListener(evento);       
		add(miboton);	
                Thread hilo = new Thread(this);
                hilo.start();
		
	}

    @Override
    public void run() {
        try{
            ServerSocket servidorC = new ServerSocket(9090);
            Socket cliente;
            EnviarDatos paketaxo2;
            while(true){
                cliente = servidorC.accept();
                ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
                paketaxo2 = (EnviarDatos)entrada.readObject();
                area.append("\n"+paketaxo2.getUsuario()+" dice: "+paketaxo2.getMsg());
            }
        }catch(Exception e){
            System.out.println("Error "+e);
        }
    }
	
	
	private class Enviar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            area.append("\n"+campo1.getText());
            try{
            Socket unsocket = new Socket("192.168.0.6", 4321);
            EnviarDatos obj = new EnviarDatos();
            //obtenemos los valores de los campos de texto para asignarlos
            obj.setUsuario(usuario.getText());
            obj.setIp(ip.getText());
            obj.setMsg(campo1.getText());
            ObjectOutputStream pq = new ObjectOutputStream(unsocket.getOutputStream());
            pq.writeObject(obj);
            campo1.setText("");
            unsocket.close();
            DataOutputStream salida = new DataOutputStream(unsocket.getOutputStream());
            salida.writeUTF(campo1.getText());
            campo1.setText("");
            //cerramos el socket para que no mehackeen
            //salida.close();
            }catch(IOException ex){
                System.out.println("Error de conexión: " + ex);
            }
            
        //Prueba System.out.println(campo1.getText());
        }
            
        }
		
	private JTextField campo1, usuario, ip;
        private JTextArea area;
	private JButton miboton;
	
}