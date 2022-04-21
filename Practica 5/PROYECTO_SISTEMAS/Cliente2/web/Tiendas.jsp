<%@page import="servidor.Direcciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                out.println("<center><br><br>");
                HttpSession empezamosdos = request.getSession(true);
                out.println("<h1>Bienvenido "+empezamosdos.getAttribute("Usuario")+"</h1>");
                /*Instanciamos la clase Direcciones con su respectivo objeto*/
                Direcciones obj_dir = new Direcciones();
                /*Declaramos un nuevo array de String que procedemos a reccorer con un bucle for-each*/
                String [] obtener = obj_dir.getDirecciones();
                for(String dir_almacenadas : obtener){
                    /*Por cada elemento que contiene nuestro arreglo imprimos un botón con su respectiva dirección*/
                    out.println("<a href='http://"+dir_almacenadas+"'><button>"+dir_almacenadas+"</button></a><br><br>");
                }
                out.println("</center>");
            }catch(Exception e){
                System.out.println("Error en Tiendas.jsp "+e);
            }
        %>
    </body>
</html>
