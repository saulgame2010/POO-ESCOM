package cliente;

import javax.swing.*;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author saulg
 */

public class ServidorChat  {

	public static void main(String[] args) {
		
		MarcoServidor mimarco=new MarcoServidor();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		setBounds(1200,300,280,350);				
		JPanel milamina= new JPanel();
		milamina.setLayout(new BorderLayout());
		areatexto=new JTextArea();
		milamina.add(areatexto,BorderLayout.CENTER);
		add(milamina);
		setVisible(true);                
                //Aquí debemos crear el hilo                
                Thread hilo = new Thread(this);             
                hilo.start();
		}
	private	JTextArea areatexto;
    @Override
    public void run() {
        //Otra prueba (:
        //System.out.println("Si sirve el hilo UwU");
        try{
        ServerSocket servidor = new ServerSocket(4321);
        String usuario, ip, msg;
        EnviarDatos paketaxo;
        ArrayList <String> listaIp = new ArrayList<String>();
        String ips = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ips);
        /*El while es para que podamos enviar varios mensajes desde el cliente,
        de otra forma el servidor cerraría la conexión desdpués de enviar un mensaje
        */
            while(true){
            //Este metodo acepta las conexiones y devuelve un elemento de tipo socket (Segun el Liu);        
            Socket unsocket = servidor.accept();   
            ObjectInputStream datitos = new ObjectInputStream(unsocket.getInputStream());
            paketaxo = (EnviarDatos) datitos.readObject();
            usuario = paketaxo.getUsuario();
            ip = paketaxo.getIp();
            msg = paketaxo.getMsg();

                if(!msg.equals(" online")){

                    areatexto.append("\n"+usuario+" dice: "+msg+" para: "+ip);
                    Socket enviarD = new Socket(ip, 9090);
                    ObjectOutputStream uff = new ObjectOutputStream(enviarD.getOutputStream());
                    uff.writeObject(paketaxo);
                    uff.close();
                    enviarD.close();        
                    unsocket.close();

                } else {

                    /*-----------Detecta las IP online-----------*/
                    InetAddress localizacion = unsocket.getInetAddress();
                    String ipRemota = localizacion.getHostAddress();
                    System.out.println("Online " + ipRemota);
                    listaIp.add(ipRemota);
                    paketaxo.setIps(listaIp);
                    for(String z : listaIp) {
                        System.out.println("Array: " + z);                        
                        Socket enviarD = new Socket(z, 9090);
                        ObjectOutputStream uff = new ObjectOutputStream(enviarD.getOutputStream());
                        uff.writeObject(paketaxo);
                        uff.close();
                        enviarD.close();        
                        unsocket.close();
                    }
                    
                    /*-------------------------------------------*/
                }

            }
        }catch(IOException i){
                System.out.println("Hay un error en el servidor "+i);
        }catch (ClassNotFoundException ex) {
                System.out.println("Hay un error en el servidor "+ex);
            }
    }
}
