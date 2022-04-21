package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modelo.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String usu="";
    String nom="";
    HttpSession sesionOK=request.getSession();
    
if(sesionOK.getAttribute("perfil")!=null)
    nom=(String)sesionOK.getAttribute("nom")+" "+(String)sesionOK.getAttribute("ape");
    
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>G'n'R</title>\n");
      out.write("       <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/normalize.min.css\">      \n");
      out.write("      <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">      \n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/flaticon.css\">     \n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Carrito</a>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h1 style=\"color:black\" align=\"center\">¡Bienvenido a Rock City!</h1>\n");
      out.write("         <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"index.jsp\">Catálogo</a></li>                \n");
      out.write("                ");

                      if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Admin")){
                    
      out.write("\n");
      out.write("                <li><a href=\"registrarProducto.jsp\">Agregar canción</a></li>\n");
      out.write("                ");

                    }
             
                      if(sesionOK.getAttribute("perfil")!=null){
                    
      out.write("\n");
      out.write("                <li><a href=\"registrarVenta.jsp\">Realizar Venta</a></li>\n");
      out.write("                ");

                    }
               
                      if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Admin")){
                    
      out.write("\n");
      out.write("                \n");
      out.write("                <li><a href=\"ServletControlador?accion=MostrarVentas\">Resgistro de Ventas</a></li>\n");
      out.write("                ");

                    }
                
      out.write("    \n");
      out.write("                \n");
      out.write("                 ");
if(sesionOK.getAttribute("perfil")!=null){
                    
      out.write("\n");
      out.write("                <li><a href=\"ServletLogueo?accion=cerrar\">Cerrar sesión</a></li>\n");
      out.write("               \n");
      out.write("                <li width=\"200\">");
out.println("Bienvenido(a) : "+nom);
      out.write("</li>\n");
      out.write("                 ");

                    }
                
      out.write("\n");
      out.write("                ");

                if(sesionOK.getAttribute("perfil")==null){
               
      out.write("\n");
      out.write("                <li width=\"200\"><a href=\"login.jsp\">Iniciar Sesion</a></li>\n");
      out.write("                 ");
 } 
      out.write("\n");
      out.write("               \n");
      out.write("            </>\n");
      out.write("        </ul>\n");
      out.write("                 <h2 align=\"center\">Canciones del álbum Appetite For Destruction (Guns N' Roses)</h2><hr>\n");
      out.write("        <table border='0' align='center' width='1000' id='canciones'>\n");
      out.write("            ");

            ArrayList<Producto> lista = ProductoDB.obtenerProducto();
            int salto=0;
            for(Producto p: lista){
            
      out.write("\n");
      out.write("            <th><img src=\"IMG/");
      out.print(p.getImagen());
      out.write("\" width=\"140\" height=\"140\"><p>\n");
      out.write("                    ");
      out.print(p.getNombre());
      out.write("<br>\n");
      out.write("                    $");
      out.print(p.getPrecio());
      out.write("<p>              \n");
      out.write("                        \n");
      out.write("                        ");

                      if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Admin")){
                    
      out.write("\n");
      out.write("                        <a href=\"actualizarProducto.jsp?id=");
      out.print(p.getCodigoProducto());
      out.write("\">Modificar</a>  /\n");
      out.write("                        ");

                            }
                        
      out.write("    \n");
      out.write("                       \n");
      out.write("                        <a href=\"anadirCarrito.jsp?id=");
      out.print(p.getCodigoProducto());
      out.write("\">Comprar</a><hr>\n");
      out.write("            </th>\n");
      out.write("            \n");
      out.write("            ");

                salto++;
                if(salto==4){            
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("            ");

                salto=0;
            }
}
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
