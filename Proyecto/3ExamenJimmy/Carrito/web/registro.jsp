<%-- 
    Document   : registro
    Created on : 31/05/2017, 12:53:09 AM
    Author     : Saúl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
 <link rel="stylesheet" href="css/normalize.min.css">
      <link rel="stylesheet" href="css/style2.css">
    </head>
    <body>
        <h2 align="center">Regístro de Usuarios</h2>
        <table border="0" width="300" align="Center">
        <form action="nuevousuario" method="post">           
           <tr>
               <td>Usuario:</td>
               <td><input type="text" placeholder="Usuario" name="txtUsu"></td>
           </tr>
           <tr>
               <td>Apellidos:</td>
               <td> <input type="text" placeholder="Apellidos" name="txtAp"></td>
           </tr>
            <tr>
               <td>Passoword:</td>
               <td> <input type="password" placeholder="Password" name="txtPas"></td>
           </tr>                        
           <tr>
               <td>Correo:</td>
               <td> <input type="email" placeholder="Correo" name="txtEmail"></td>
           </tr>    
           <tr>
               <td>Localidad:</td>
               <td> <input type="text" placeholder="Localidad" name="txtLoc"></td>
           </tr>
           <tr>
               <th colspan="2">
                 <input type="submit" name="btn" value="Registrar"> 
               </th>
           </tr> 
           </form>
        </table>
    </body>
</html>
