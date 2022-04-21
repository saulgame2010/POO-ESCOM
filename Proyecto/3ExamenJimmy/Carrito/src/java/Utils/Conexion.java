package Utils;

import java.sql.*;

/**
 *
 * @author Saúl
 */
public class Conexion {

    public static Connection getConexion(){
        Connection cn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn =  DriverManager.getConnection("jdbc:mysql://localhost/bdcarrito", "root", "");
            System.out.println("Conectó a la base *w*");
        }catch(Exception e){System.out.println("Error de conexion: "+e);}
        return cn;
 }
    
    public static void main(String[] args) {
        Conexion.getConexion();
    }
    
}
