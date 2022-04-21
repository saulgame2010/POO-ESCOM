import java.sql.*;
import javax.swing.*;

public class Conexion {
	
	public String bd = "Practica7";
	public String url = "jdbc:mysql://localhost:3306/" + bd;
	public String usuario = "root";
	public String pass = "root";

	public Connection Conectate() {

       Connection link = null;

       try{

           Class.forName("org.gjt.mm.mysql.Driver");

           link = DriverManager.getConnection(this.url, this.usuario, this.pass);

       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, ex);

       }

       return link;
   
	}

}