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
        <h1>Bienvenido a mi tienda</h1>
        <%
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
                                +"<a href='ServletCompra'><button></a>"
                                + "</center></div>");
            }
        }catch(Exception e){
            System.out.println("Error en consultar productos "+e);
        }
        /*Aqui puedes instanciar parte de tu clase cliente para el chat, la otra parte se agrega en el 
        proyecto SERVIDOR_PROYECTO
        
        Puedes mandar llamarla
        ClienteChat ovejota = new ClienteChat()
        y con eso ejecutas el método que lo haga funcionar, si es el main entonces debes pasarlo a un
        void normal para que se mande llamar desde aqui
        */
        %>
    </body>
</html>
