package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Bienvenido al mercado en línea<br>Incia sesión</h1>\n");
      out.write("        <form method=\"post\" action=\"index.jsp\">\n");
      out.write("            <input type=\"text\" placeholder=\"Usuario\" id=\"nomUsu\" name=\"nomUsu\">\n");
      out.write("            <input type=\"text\" placeholder=\"Numero de tarjeta\" id=\"tarjeta\" name=\"tarjeta\">\n");
      out.write("            <input type=\"text\" placeholder=\"Cotraseña\">\n");
      out.write("            <input type=\"Submit\" value=\"Enviar\"> \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <a><applet code=\"Cliente_1.class\">H</applet></a>\n");
      out.write("        ");

            String nomUsuario = request.getParameter("nomUsu");
            String tarj = request.getParameter("tarjeta");
            if(nomUsuario!=null){
                HttpSession empezamos = request.getSession(true);
                empezamos.setAttribute("Usuario",nomUsuario);
                empezamos.setAttribute("NoTarj",tarj);
                response.sendRedirect("Tiendas.jsp");
            }else{
            }
            /*try{
                String usuario = request.getParameter("Usuario");
                String pass = request.getParameter("Contrasena");
                conexionBDR obj = new conexionBDR();
                Connection con = obj.getConexion();
                String SQL = "SELECT * FROM Usuario WHERE Nombre=? AND Contrasena=?";
                PreparedStatement PS = con.prepareStatement(SQL);
                PS.setString(1,usuario);
                PS.setString(2,pass);
                ResultSet rs;
                rs=PS.executeQuery();
                if(rs.absolute(1)){
                    response.sendRedirect("Inicio.jsp");
                }else{
                    response.sendRedirect("index.jsp");
                }
            }catch(Exception e){
                System.out.println("Error en inicar sesion "+e);
            }*/
        
      out.write("\n");
      out.write("    </center>\n");
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
