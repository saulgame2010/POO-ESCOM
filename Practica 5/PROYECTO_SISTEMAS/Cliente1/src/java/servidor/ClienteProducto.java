package servidor;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteProducto {
    public void enviarServidor(String noTarjeta, String producto, String cantidad, String precio, String comprador){
        Socket cliente;
        try {
        cliente = new Socket("192.168.1.100",4000);
        OutputStream flujoSalida = cliente.getOutputStream();
        PrintWriter dato2 = new PrintWriter(new OutputStreamWriter(flujoSalida));
        dato2.println(noTarjeta);
        dato2.println(producto);
        dato2.println(cantidad);
        dato2.println(precio);
        dato2.println(comprador);
        dato2.flush();
        System.out.println("Enviado");
        } catch (IOException ex) {
            Logger.getLogger(ClienteProducto.class.getName()).log(Level.SEVERE, null, ex);
        }	
    }
}
