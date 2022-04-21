<%-- 
    Document   : anadirCarrito
    Created on : 29/05/2017, 02:27:31 AM
    Author     : Saúl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.*"%>
<%@page session="true"%>

<%
    String usu="";
    String nom="";
    HttpSession sesionOK=request.getSession();
    
if(sesionOK.getAttribute("perfil")!=null)
    nom=(String)sesionOK.getAttribute("nom")+" "+(String)sesionOK.getAttribute("ape");

if (sesionOK.getAttribute("perfil") == null) {
    %>
    <jsp:forward page="login.jsp"/>
<%
} else {
usu = (String)sesionOK.getAttribute("perfil");
}
%>
    
<!DOCTYPE html>
<%
    Producto p = ProductoDB.obtenerProducto(Integer.parseInt(request.getParameter("id")));
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
 <link rel="stylesheet" href="css/normalize.min.css">
      <link rel="stylesheet" href="css/tablas.css">
       <link rel="stylesheet" href="css/bootstrap.min.css">      
<link rel="stylesheet" href="css/estilos.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/flaticon.css">
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
               
                <th width="200"><%out.println("Bienvenido(a) : "+nom);%></th>
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
        <h2 align="center">Añadir canción al carrito</h2>
        <table border="0" width="500" align="center">
            <form method="post" action="ServletControlador">
                <tr>
        <th rowspan="5"><img src="IMG/<%=p.getImagen()%>" width="140" height="140"></th>
        <th>Código</th>
        <th><input type="text" name="txtCodigo" value="<%=p.getCodigoProducto()%>" readonly ></th>
        </tr><tr>
        <th>Nombre</th>
        <th><input type="text" name="txtNombre" value="<%=p.getNombre()%>" readonly >  </th>
        </tr><tr>
        <th>Precio</th>
        <th><input type="text"  name="txtPrecio" value="$<%=p.getPrecio()%>" readonly /></th>
        </tr><tr>
        <th>Cantidad</th>
        <th><input type="number" value="0" min="0" max="10" name="txtCantidad" value="0" /></th>
        </tr>
        <tr>
        <th colspan="3"><input type="submit" class="btn btn-primary" value="Añadir" name="btnAnadir"></th>
        </tr>
        <input type="hidden" name="accion" value="AnadirCarrito" />
            </form>
        </table>
    </body>
</html>
