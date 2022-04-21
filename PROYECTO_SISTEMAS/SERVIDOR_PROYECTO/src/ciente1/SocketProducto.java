package ciente1;

import java.net.*;
import java.io.*;

public class SocketProducto {
    public void iniciar(){
        try{
            System.out.println("Inicioando servidor");
            ServerSocket server = new ServerSocket(4000);
            Socket SS = server.accept();
            System.out.println("\nYa conecto");
            InputStream flujoEntrada = SS.getInputStream();
            BufferedReader mensaje = new BufferedReader(new InputStreamReader(flujoEntrada));
            String dato2 = mensaje.readLine();
            String dato3 = mensaje.readLine();
            String dato4 = mensaje.readLine();
            String dato5 = mensaje.readLine();
            String dato6 = mensaje.readLine();
            System.out.println(dato2);
            System.out.println(dato3);
            System.out.println(dato4);
            System.out.println(dato5);
            System.out.println(dato6);
            RegistroBD nn = new RegistroBD();
            SS.close();
            server.close();
        }catch(Exception e){
            System.out.println("Ayuda en servidorProductos: "+e);
        }
    }
}
