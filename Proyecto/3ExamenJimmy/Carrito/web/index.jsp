

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
        <title>G'n'R</title>
       <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
 <link rel="stylesheet" href="css/normalize.min.css">      
      <link rel="stylesheet" href="css/bootstrap.min.css">      
<link rel="stylesheet" href="css/estilos.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/flaticon.css">     
    </head>
    <body >
        <nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      
    </div>
        
        
      
         <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="index.jsp">Catálogo</a></li>                
                <%
                      if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Admin")){
                    %>
                <li><a href="registrarProducto.jsp">Agregar canción</a></li>
                <%
                    }
             
                      if(sesionOK.getAttribute("perfil")!=null){
                    %>
                <li><a href="registrarVenta.jsp">Realizar Venta</a></li>
                <%
                    }
               
                      if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Admin")){
                    %>
                
                <li><a href="ServletControlador?accion=MostrarVentas">Resgistro de Ventas</a></li>
                <%
                    }
                %>    
                
                 <%if(sesionOK.getAttribute("perfil")!=null){
                    %>
                <li><a href="ServletLogueo?accion=cerrar">Cerrar sesión</a></li>
               
                <li width="200"><%out.println("Bienvenido(a) : "+nom);%></li>
                 <%
                    }
                %>
                <%
                if(sesionOK.getAttribute("perfil")==null){
               %>
                <li width="200"><a href="login.jsp">Iniciar Sesion</a></li>
                 <% } %>
               
            
      </ul>
         </div>
  </div>
        </nav>
                 <!--Star slider-->
                <!-- <div class="container-fluid">
                     <div class="row">
                         <div class="col-md-12">
                             <div class="jumbotron">
                                 <h2 align="center">Canciones del álbum Appetite For Destruction (Guns N' Roses)</h2>
                             </div>
                         </div>
                     </div>
                 </div>-->
                 
                   <!-- STAR PRODUCTO -->
       <section id="producto">
           <div class="container">
               <div class="row">
                   <div class="col-md-12">
                       <div class="titulo">
                           <h2>Canciones</h2>
                           <hr>
                       </div>
                   </div>
                 
        
            <%
            ArrayList<Producto> lista = ProductoDB.obtenerProducto();
            
            for(Producto p: lista){
            %>
            
           <div class="col-sm-4 col-lg-4 col-md-4">
                        <div class="thumbnail text-center">                            
                            <img src="IMG/<%=p.getImagen()%>" class="img-responsive" alt="">                                                                                         
                            <div class="caption">
                                <h4 class="pull-right precio">$<%= p.getPrecio()%></h4>
                                <h4><a href="#"><%= p.getNombre()%></a>
                                </h4> 
                        
                        <%
                      if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Admin")){
                    %>
                        <a class="btn btn-primary" href="actualizarProducto.jsp?id=<%=p.getCodigoProducto()%>">Modificar</a>  /
                        <%
                            }
                        %>    
                       
                        <a href="anadirCarrito.jsp?id=<%=p.getCodigoProducto()%>">Comprar</a><hr>
                            </div>
                        </div>
           </div>
            
            
            <%
                    }      
            %>
               </div>
           </div>
       </section>
    </main>
    <script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/owl.carousel.js"></script>
<script src="js/code.js"></script>
    </body>
</html>
