package cliente;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.applet.*;
import java.util.ArrayList;
/**
 *
 * @author saulg
 */

public class ClienteChat {

	public static void main(String[] args) {
		// Aquí se hace la ventanita bien bonita así como su carita toda preciosa, me encanta <3
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
                addWindowListener(new EnvioOnline());
	}	
	
}

    /*-------------Evento de estar online-------------*/
class EnvioOnline extends WindowAdapter{
    @Override
    public void windowOpened(WindowEvent e) {
        try{
            //Aqui va a ir la ip del servidor y el puerto
            Socket misocket = new Socket("192.168.0.6", 4321);
            EnviarDatos datos;
            datos = new EnviarDatos();
            datos.setMsg(" online");            
            ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
            paquete_datos.writeObject(datos);
            misocket.close();
            
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
} 
    /*-----------------------------------------------*/

//Aquí agregamos todos los componentes a nuestra ventanita
class LaminaMarcoCliente extends JPanel implements Runnable{
	public LaminaMarcoCliente(){
            
                String nick_usuario = JOptionPane.showInputDialog("Introduce tu nombre de usuario: ");
                JLabel n_nick = new JLabel("Usuario: ");
                add(n_nick);
                usuario = new JLabel();
                usuario.setText(nick_usuario);
                add(usuario);                
            	JLabel texto=new JLabel(" Online:");
		add(texto);
                ip = new JComboBox();                
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
            String ips = InetAddress.getLocalHost().getHostAddress();
            System.out.println(ips);
            while(true){
                cliente = servidorC.accept();
                ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
                paketaxo2 = (EnviarDatos)entrada.readObject();
                if(!paketaxo2.getMsg().equals(" online")) {
                    area.append("\n"+paketaxo2.getUsuario()+" dice: "+paketaxo2.getMsg());
                } else {
                    ArrayList <String> ipsMenu = new ArrayList<String>();
                    ipsMenu = paketaxo2.getIps();
                    ip.removeAllItems();
                    
                    for(String z : ipsMenu) {
                        
                        ip.addItem(z);
                        System.out.println(z);
                    }
                }                                            
            }
        }catch(Exception e){
            System.out.println("Error "+e);
        }
    }
	
	
	private class Enviar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //con esto mostramos los mensajes al obtener el texto del campo1
            area.append("\n"+campo1.getText());
            try{
            Socket unsocket = new Socket("192.168.56.1", 4321);
            EnviarDatos obj = new EnviarDatos();
            //obtengo los valores de los campos de texto para asignarlos
            //Aquí es donde asigno el nombre
            obj.setUsuario(usuario.getText());
            //Aquí es donde asigno la ip
            obj.setIp(ip.getSelectedItem().toString());
            obj.setMsg(campo1.getText());
            ObjectOutputStream pq = new ObjectOutputStream(unsocket.getOutputStream());
            pq.writeObject(obj);
            campo1.setText("");
            unsocket.close();
            DataOutputStream salida = new DataOutputStream(unsocket.getOutputStream());
            salida.writeUTF(campo1.getText());
            campo1.setText("");
            //cerramos el socket para que no mehackeen
            salida.close();
            }catch(IOException ex){
                System.out.println("Error de conexión: " + ex);
            }
            
        //Prueba System.out.println(campo1.getText());
        }
            
        }
		
	private JTextField campo1;
        private JComboBox ip;
        private JLabel usuario;
        private JTextArea area;
	private JButton miboton, miboton2;
	
}