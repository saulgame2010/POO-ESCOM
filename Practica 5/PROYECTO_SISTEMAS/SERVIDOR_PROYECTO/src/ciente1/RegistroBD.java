package ciente1;


import java.sql.*;

public class RegistroBD {
    conexionBD conex = new conexionBD();
    Connection con = conex.getConexion();
    
    public void Insertar(String nombreProducto,String nombreUsuario, String cantidad, String precio, String tarjeta){
        try{
            int cantidadB=Integer.parseInt(cantidad);
            double precioB=Double.parseDouble(precio);
        }catch(Exception e){
            System.out.println("Error en servidor RegistroDB "+e);
        }
        
    }
    
}
