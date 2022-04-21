package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Carrito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Carrito de Compras</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/flaticon.css\"> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <main>\n");
      out.write("       <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">FcCarrito</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"#\">Link <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("        <li><a href=\"#\">Link</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("            <li><a href=\"#\">Action</a></li>\n");
      out.write("            <li><a href=\"#\">Another action</a></li>\n");
      out.write("            <li><a href=\"#\">Something else here</a></li>\n");
      out.write("            <li class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">Separated link</a></li>\n");
      out.write("            <li class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">One more separated link</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>      \n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\">Link</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <section id=\"carrito-compras\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-10 col-md-offset-1\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"panel-title\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-6\">\n");
      out.write("                                            <h5><i class=\"flaticon-shopping-cart\"></i> Tu Carrito</h5>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-6\">\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-primary btn-sm btn-block\">\n");
      out.write("                                                <i class=\"flaticon-next\"></i> Continuar con la Compra\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                               <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-5 text-center\">\n");
      out.write("                                        <p>PRODUCTO</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-7\">\n");
      out.write("                                        <div class=\"col-xs-2 text-center col-md-3\">\n");
      out.write("                                            <p>PRECIO</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-4 text-center col-md-3\">\n");
      out.write("                                            <p>CANTIDAD</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-4 text-center col-md-4\">\n");
      out.write("                                            <p>TOTAL</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-2 col-md-2\">                                        \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>                                    \n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-2\">\n");
      out.write("                                        <img class=\"img-responsive\" src=\"img/1.jpg\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <h4 class=\"product-name\"><strong>Product name</strong></h4><h4><small>Product description</small></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-7\">\n");
      out.write("                                        <div class=\"col-xs-2 col-md-3\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm\" value=\"1\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-4 text-center col-md-3\">\n");
      out.write("                                            <h6>x <strong>25.00 <span class=\"text-muted\">x</span></strong></h6>\n");
      out.write("                                        </div>  \n");
      out.write("                                        <div class=\"col-xs-4 text-center col-md-4\">\n");
      out.write("                                            <h6> <strong>25.00 <span class=\"text-muted\">x</span></strong></h6>\n");
      out.write("                                        </div>                                       \n");
      out.write("                                        <div class=\"col-xs-2 col-md-2 text-center\">\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-link btn-xs\">\n");
      out.write("                                                <span class=\"flaticon-garbage\"> </span>\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>                                                                                                                            \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                <div class=\"row text-center\">\n");
      out.write("                                    <div class=\"col-xs-9\">\n");
      out.write("                                        <h4 class=\"text-right\">Total <strong>$50.00</strong></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-success btn-block\">\n");
      out.write("                                            Comprar\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/owl.carousel.js\"></script>\n");
      out.write("<script src=\"js/code.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
