<%-- 
    Document   : registrarProducto2
    Created on : may 29, 2017, 9:31:01 a.m.
    Author     : carli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>

<%
    String usu="";
    String nom="";
    HttpSession sesionOK=request.getSession();
    
if(sesionOK.getAttribute("perfil")!=null)
    nom=(String)sesionOK.getAttribute("nom")+" "+(String)sesionOK.getAttribute("ape");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
 <link rel="stylesheet" href="css/normalize.min.css">
      <link rel="stylesheet" href="css/tablas.css">
    </head>
    <body>
        
        
       <table border="0" width="1000" align="center" id='menu'>
            <tr>
                <th><a href="index.jsp">Canciones</a></th>
                <%
                      if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Admin")){
                    %>
                <th><a href="registrarProducto.jsp">Registrar Producto</a></th>
                <%
                    }
             
                      if(sesionOK.getAttribute("perfil")!=null){
                    %>
                <th><a href="registrarVenta.jsp">Registrar Ventas</a></th>
                <%
                    }
               
                      if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Admin")){
                    %>
                
                <th><a href="ServletControlador?accion=MostrarVentas">Consultar Ventas</a></th>
                <%
                    }
                %>    
                
                 <%if(sesionOK.getAttribute("perfil")!=null){
                    %>
                <th><a href="ServletLogueo?accion=cerrar">Cerrar sesión</a></th>
               
                <th width="200"><%out.println("Bienvenido : "+nom);%></th>
                 <%
                    }
                %>
                <%
                if(sesionOK.getAttribute("perfil")==null){
               %>
                <th width="200"><a href="login.jsp">Iniciar Sesion</a></th>
                 <% } %>
               
            </tr>
        </table>
        <h2 align="center">Regsitrar Producto</h2>
        
         <form class="form-horizontal" action="ServletControlador" method="get">
        <table borer="0" width="350" align="center">
        <%
        String img=request.getParameter("img");
    %>
    <tr>
        <td>Nombre: </td>
        <td><input type="text" name="txtNombre" ></td>
    </tr> 
    <tr>
        <td>Precio: </td>
        <td><input type="text" name="txtPrecio" value="0"> </td>
    </tr> 
    <tr>
        <th colspan="2">
            <input type="submit" value="Registrar" name="CargarImagen"/>
        </th>
    </tr>                                                                             
     <input type="hidden" name="txtImagen" value="<%=img%>"/>
      
     <input type="hidden" name="accion" value="RegistrarProducto"/>
        </table>  
    </form> 
        
    </body>
</html>
