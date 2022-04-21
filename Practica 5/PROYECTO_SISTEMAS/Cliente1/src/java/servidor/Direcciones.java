package servidor;
public class Direcciones {
    /*Declaramos un arreglo de Strings, mismo que contiene las direcciones de los demás servidores
    lo declaramos de manera que se pueda llamar desde otra clase (Tiendas.jsp)*/
    public String[] getDirecciones(){
        String[] direcciones={"192.168.1.120:8080/Cliente2/MisProductosCliente.jsp"};
        return direcciones;
    }
    public String[] getDireccionesChat(){
        String[] direcciones={"127.0.0.1", "192.168.0.5"};
        return direcciones;
    }
}
