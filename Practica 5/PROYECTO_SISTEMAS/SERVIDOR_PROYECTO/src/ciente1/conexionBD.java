package ciente1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBD {
    /*Agregamos los valores que corresponden a nuestra base de datos*/
    private String USERNAME="root";
    private String PASSWORD="4b1b3b3";
    private String HOST="localhost";
    private String PORT="3306";
    private String DATABASE="SERVIDOR";
    private String CLASSNAME="com.mysql.jdbc.Driver";
    private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    Connection con;

    public conexionBD() {
        try {
            Class.forName(CLASSNAME);
            con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR "+ e);
        }
        catch(SQLException e){
            System.err.println("ERROR "+e);
        }
    }
    public Connection getConexion(){
        return con;
    }
   
}
