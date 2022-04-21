import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import servidor.DatosProducto;

public class ServletCompra extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession empezar3 = request.getSession(true);
            String nombreProducto= request.getParameter("nP");
            String cantidadN= request.getParameter("cP");
            String usuario= (String)empezar3.getAttribute("Usuario");
            String precioN = request.getParameter("pP");
            String noTarjeta = (String)empezar3.getAttribute("NoTarj");
            //Creamos un reedireccionamiento
            String direccion = "TerminarCompra?nP="+nombreProducto+"&cP="+cantidadN+"&usu="+usuario+"&pP="+precioN+"&nT="+noTarjeta;
            out.println("<center>");
            out.println("<h1>Confirmar compra "+usuario+"</h1>");
            out.println("<h3>Producto: "+nombreProducto);
            out.println("Precio: "+precioN);
            out.println("Cantidad: "+cantidadN);
            out.println("Tarjeta: "+noTarjeta);
            out.println("<a href='"+direccion+"'><button>Comprar</button></a>");
        }catch(Exception e){
            System.out.println("Error en comprar, ayuda bebé "+e);
        }
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
