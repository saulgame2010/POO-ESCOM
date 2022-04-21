<%-- 
    Document   : login
    Created on : may 30, 2017, 9:31:27 a.m.
    Author     : Saúl
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
      <link rel="stylesheet" href="css/style2.css">
      
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
        
            <!--<h2 align="center">Logueo de Usuarios</h2>
        <table border="0" width="300" align="Center">
        <form action="ServletLogueo" method="post">
           <input type="hidden" name="accion" value="loguin"/>
           <tr>
               <td>Usuario:</td>
               <td><input type="text" placeholder="Usuario" name="txtUsu"></td>
           </tr>
            <tr>
               <td>Passoword:</td>
               <td> <input type="password" placeholder="Password" name="txtPas"></td>
           </tr>                  
           <tr>
               <th colspan="2">
                 <input type="submit" name="btn" value="Iniciar Sesion"> 
               </th>
           </tr> 
           <tr>
               <th><a href="registro.jsp">¿No tienes cuenta? Regístrate</a></th>
           </tr>
           </form>
        </table>
        <h4 align="center">-->
            
            <div class="form">
      
      <ul class="tab-group">
        <li class="tab active"><a href="#signup">Regístrate</a></li>
        <li class="tab"><a href="#login">Iniciar Sesión</a></li>
      </ul>
      
      <div class="tab-content">
        <div id="signup">   
          <h1>Carrito de Compras</h1>
          
          <form action="nuevousuario" method="post">
          
          <div class="top-row">
            <div class="field-wrap">
              <label>
                Nombre<span class="req"></span>
              </label>
              <input type="text" required autocomplete="off" name="txtUsu" id="txtUsu"/>
            </div>
        
            <div class="field-wrap">
              <label>
                Apellidos<span class="req"></span>
              </label>
              <input type="text"required autocomplete="off" name="txtAp" id="txtAp"/>
            </div>
          </div>
         
              
         <div class="field-wrap">
            <label>
              Password<span class="req"></span>
            </label>
            <input type="password"required autocomplete="off" name="txtPas"/>
          </div>
              
         <div class="field-wrap">
            <label>
                Correo<span class="req"></span>
            </label>
             <input maxlength="120" type="email"required autocomplete="off" name="txtEmail"/>
          </div>     

          <div class="field-wrap">
            <label>
              Localidad<span class="req"></span>
            </label>
            <input type="text"required autocomplete="off" name="txtLoc"/>
          </div>
                    
          
          <button type="submit" class="button button-block"/>Registrarse</button>
          
          </form>

        </div>
        
        <div id="login">   
          <h1>¡Bienvenido!</h1>
          
          <form action="ServletLogueo" method="post">
          <input type="hidden" name="accion" value="loguin"/>
            <div class="field-wrap">
            <label>
              Nombre<span class="req"></span>
            </label>
            <input type="text"required autocomplete="off" name="txtUsu"/>
          </div>
          
          <div class="field-wrap">
            <label>
              Contraseña<span class="req" ></span>
            </label>
            <input type="password"required autocomplete="off" name="txtPas"/>
          </div>
          
          <!--<p class="forgot"><a href="#">Forgot Password?</a></p>-->
          
          <button class="button button-block"/>Iniciar Sesión</button>
          
          </form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->
  <script src='js/jquery.min.js'></script>

    <script src="js/index.js"></script>
             <%
              if(request.getAttribute("msg")!=null)
                 out.println(request.getAttribute("msg"));
             %>
       </h4>
        
        
    </body>
</html>
