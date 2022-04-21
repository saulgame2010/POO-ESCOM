<%@page import="java.sql.*"%>
<%@page import="servidor.conexionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
        //
        conexionBD obj_conex = new conexionBD();
        Connection con = obj_conex.getConexion();      
        try{
            String consultaSQL = "SELECT * FROM Productos";
            PreparedStatement statementSQL = con.prepareStatement(consultaSQL);
            ResultSet resultado = statementSQL.executeQuery();
            while(resultado.next()){
                out.println("<div><center>"
                        + "<img src='IMG/"+resultado.getString("Imagen")+"'>"
                                +"<h3>"+resultado.getString("Producto")+"</h3>"
                                +"<h3>Precio: "+resultado.getDouble("Precio")+"</h3>"
                                +"</center></div>");
            }
        }catch(Exception e){
            System.out.println("Error en consultar productos "+e);
        }
        %>
    </center>
    </body>
</html>
