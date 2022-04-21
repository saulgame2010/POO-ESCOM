package servidor;
public class Direcciones {
    /*Declaramos un arreglo de Strings, mismo que contiene las direcciones de los demás servidores
    lo declaramos de manera que se pueda llamar desde otra clase (Tiendas.jsp)*/
    public String[] getDirecciones(){
        String[] direcciones={"192.168.1.120:8080/Cliente2/MisProductosCliente.jsp","192.168.9.2:8080/Cliente3",
            "192.168.9.3:8080/Cliente4","index.jsp"};
        return direcciones;
    }
}
