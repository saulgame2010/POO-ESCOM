<%-- 
    Document   : Chat
    Created on : 30/11/2017, 12:13:54 PM
    Author     : saulg
--%>

<%@page import="java.io.ObjectOutputStream"%>
<%@page import="java.net.Socket"%>
<%@page import="servidor.Cliente_1"%>
<%@page import="servidor.EnviarDatos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="Chat.jsp">
            
            <input type="text" id="ip" placeholder="ingresa la ip">
            <input type="text" id="mensaje" placeholder="ingresa tu mensaje">
            
            
        </form>
    <%
    try{
            HttpSession sesion = request.getSession(true);
            Socket unsocket = new Socket("127.0.0.1", 4321);
            String msg = request.getParameter("mensaje");
            String ip = request.getParameter("ip");            
            String usuario = (String) sesion.getAttribute("Usuario");
            EnviarDatos obj = new EnviarDatos();
            //obtengo los valores de los campos de texto para asignarlos
            //Aquí es donde asigno el nombre
            obj.setUsuario(usuario);
            //Aquí es donde asigno la ip
            obj.setIp(ip);
            obj.setMsg(msg);
            ObjectOutputStream pq = new ObjectOutputStream(unsocket.getOutputStream());
            pq.writeObject(obj);
            
            unsocket.close();
            
            }catch(Exception ex){
                System.out.println("Error de conexión: " + ex);
            }
            Cliente_1 obj = new Cliente_1();
            
    %>
    </body>
</html>
