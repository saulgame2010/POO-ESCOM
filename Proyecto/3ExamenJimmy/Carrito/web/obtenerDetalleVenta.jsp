<%-- 
    Document   : obtenerDetalleVenta
    Created on : may 30, 2017, 9:18:19 a.m.
    Author     : carli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.*,java.util.*" %>
<!DOCTYPE html>
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
        <table border="1" width="600" align="Center" id='menu'>
  <tr>
    <th>CodPro</th>
    <th>Cantidad</th><th>Descuento</th>
  </tr>
    <%
    ArrayList<DetalleVenta> lista = 
            DetalleVentaDB.obtenerDetalleVenta
                            (Integer.parseInt(request.getParameter("cod")));
     for (int i=0;i<lista.size();i++) {
         DetalleVenta d=lista.get(i);
          %>
          <tr>
          <td><%= d.getCodigoProducto()%></td>
          <td><%= d.getCantidad() %></td>
          <td><%= d.getDescuento() %></td>
           </tr>
      <%
        }
      %>                         
    </table> 
        
        
        
    </body>
</html>
