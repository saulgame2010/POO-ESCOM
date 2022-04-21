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
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            DatosProducto obj = new DatosProducto();
            String noTarjeta = request.getParameter("tarjeta");
            ClienteProducto aver = new ClienteProducto();
            aver.enviarServidor(noTarjeta,obj.getNombreProducto(),obj.getCantidad(),obj.getPrecio(),obj.getComprador());
            out.println("<h1>¡Compra exitosa, muchas gracias!</h1>");
            response.sendRedirect("http://localhost:8080/Cliente1/Tiendas.jsp");
        }catch(Exception a){
            System.out.println("Ayudame mi amor, soy terminar compra"+a);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
