<%-- 
    Document   : index
    Created on : 25/11/2017, 07:39:52 PM
    Author     : usuario
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Bienvenido al mercado en línea<br>Incia sesión</h1>
        <form method="post" action="index.jsp">
            <input type="text" placeholder="Usuario" id="nomUsu" name="nomUsu">
            <input type="text" placeholder="Numero de tarjeta" id="tarjeta" name="tarjeta">
            <input type="text" placeholder="Cotraseña">
            <input type="Submit" value="Enviar"> 
        </form>
        
        <applet code="Cliente_1.class"></applet>
        <%
            String nomUsuario = request.getParameter("nomUsu");
            String tarj = request.getParameter("tarjeta");
            if(nomUsuario!=null){
                HttpSession empezamos = request.getSession(true);
                empezamos.setAttribute("Usuario",nomUsuario);
                empezamos.setAttribute("NoTarj",tarj);
                response.sendRedirect("Tiendas.jsp");
            }else{
            }
            /*try{
                String usuario = request.getParameter("Usuario");
                String pass = request.getParameter("Contrasena");
                conexionBDR obj = new conexionBDR();
                Connection con = obj.getConexion();
                String SQL = "SELECT * FROM Usuario WHERE Nombre=? AND Contrasena=?";
                PreparedStatement PS = con.prepareStatement(SQL);
                PS.setString(1,usuario);
                PS.setString(2,pass);
                ResultSet rs;
                rs=PS.executeQuery();
                if(rs.absolute(1)){
                    response.sendRedirect("Inicio.jsp");
                }else{
                    response.sendRedirect("index.jsp");
                }
            }catch(Exception e){
                System.out.println("Error en inicar sesion "+e);
            }*/
        %>
    </center>
    </body>
</html>
