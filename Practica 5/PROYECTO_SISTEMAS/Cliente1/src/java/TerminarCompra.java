import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servidor.ClienteProducto;
import servidor.DatosProducto;

public class TerminarCompra extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nombreProducto= request.getParameter("nP");
            String cantidadN= request.getParameter("cP");
            String usuario= request.getParameter("usu");
            String precioN = request.getParameter("pP");
            String noTarjeta = request.getParameter("nT");
            out.println("<h1>¡Compra exitosa, muchas gracias!</h1>");
            ClienteProducto mandar = new ClienteProducto();
            mandar.enviarServidor(noTarjeta,nombreProducto,cantidadN,precioN,usuario);
            response.sendRedirect("http://localhost:8080/Cliente1/Tiendas.jsp");
        }catch(Exception a){
            System.out.println("Ayudame mi amor, soy terminar compra"+a);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
