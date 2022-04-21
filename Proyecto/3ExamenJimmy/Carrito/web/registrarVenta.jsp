<%-- 
    Document   : registrarVenta
    Created on : 29/05/2017, 03:09:45 AM
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
        <h2 align="center">Carrito de compras</h2>
        
        <form method="post" action="ServletControlador">
            <input type="hidden" name="accion" value="RegistrarVenta"/>
            <table border="1" align="center" width="450">
               <input type="hidden" name="txtCliente" value="<%
             if(sesionOK.getAttribute("perfil")!=null)
                out.println(nom);%>" readonly="readonly">
                    
                </tr>
                
                <tr style="color: black; font-weight: bold">
                    <td width="180">Nombre</td>
                    <td>Precio</td>
                    <td>Cantidad</td>
                    <td>Descuento</td>
                    <td>Subtotal</td>
                </tr>
                
                <%
                double total=0;
                ArrayList<DetalleVenta> lista = (ArrayList<DetalleVenta>)session.getAttribute("carrito");
                if(lista!=null){
                    
                            for(DetalleVenta d: lista){
                %>
                <tr>
                    <td><%=d.getProducto().getNombre()%></td>
                    <td><%=d.getProducto().getPrecio()%></td>
                    <td><%=d.getCantidad()%></td>
                    <td><%=String.format("%.2f",(d.getDescuento()))%></td>
                    <td><%=String.format("%.2f",(d.getProducto().getPrecio() * d.getCantidad())-d.getDescuento())%></td>
                </tr>
                <%
                total=total+(d.getProducto().getPrecio() * d.getCantidad())-d.getDescuento();
                }
}
                %>
                <tr>
                    <th colspan="4" align="right">Total</th>
                    <th>$<%=String.format("%.2f",(total))%></th>
                </tr>
                <tr>
                    <td colspan="5">
                        <input type="submit" value="Registrar Venta" name="btnVenta"/>
                    </td>
                </tr>
            </table>
        </form>
                <div>
                      <h3 align="center"><a href="index.jsp">Seguir Comprando</a> || 
        <a href="ServletLogueo?accion=Cancelar">Cancelar Compra</a>
    
    </h3>
                </div>
    </body>
</html>
