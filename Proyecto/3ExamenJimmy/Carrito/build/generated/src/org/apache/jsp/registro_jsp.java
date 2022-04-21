package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2 align=\"center\">Logueo de Usuarios</h2>\n");
      out.write("        <table border=\"0\" width=\"300\" align=\"Center\">\n");
      out.write("        <form action=\"\" method=\"post\">           \n");
      out.write("           <tr>\n");
      out.write("               <td>Usuario:</td>\n");
      out.write("               <td><input type=\"text\" placeholder=\"Usuario\" name=\"txtUsu\"></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("               <td>Passoword:</td>\n");
      out.write("               <td> <input type=\"password\" placeholder=\"Password\" name=\"txtPas\"></td>\n");
      out.write("           </tr>  \n");
      out.write("           <tr>\n");
      out.write("               <td>Apellidos:</td>\n");
      out.write("               <td> <input type=\"text\" placeholder=\"Apellidos\" name=\"txtAp\"></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("               <td>Localidad:</td>\n");
      out.write("               <td> <input type=\"text\" placeholder=\"Localidad\" name=\"txtLoc\"></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("               <td>correo:</td>\n");
      out.write("               <td> <input type=\"email\" placeholder=\"Correo\" name=\"txtEmail\"></td>\n");
      out.write("           </tr>           \n");
      out.write("           <tr>\n");
      out.write("               <th colspan=\"2\">\n");
      out.write("                 <input type=\"submit\" name=\"btn\" value=\"Iniciar Sesion\"> \n");
      out.write("               </th>\n");
      out.write("           </tr> \n");
      out.write("           </form>\n");
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
