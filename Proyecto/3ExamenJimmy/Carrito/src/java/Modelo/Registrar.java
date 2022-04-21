/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Utils.Conexion;
import java.sql.*;

/**
 *
 * @author Saúl
 */
public class Registrar {
    
    public boolean registro(String Apellido, String Nombre, String Localidad, String Correo, String Clave){
    
        PreparedStatement ps= null;
        
        try{
            String consulta = "INSERT INTO usuarios(ApeUsu, nomUsu, Ditrito,Perfil, Correo, claveUsu) VALUES(?,?,?,'Cliente',?,?)";
            ps = Conexion.getConexion().prepareStatement(consulta);
            ps.setString(1, Apellido);
            ps.setString(2, Nombre);
            ps.setString(3, Localidad);
            ps.setString(4, Correo);
            ps.setString(5, Clave);
            
            if(ps.executeUpdate() == 1){
                return true;
            }
        }catch(Exception e){
            System.out.println("Error!!"+e);
        }finally{
            try{
                if(Conexion.getConexion() != null) Conexion.getConexion().close();
                if(ps != null) ps.close();
            }catch(Exception e){
            System.out.println("Error!!");    
            }
        }
        
        return false;
        
    }
    
    public static void main (String [] args){
        Registrar r = new Registrar();
        System.out.println(r.registro("García", "Saul", "CDMX", "saulgame2009@gmail.com", "hola"));
    }
    
}
