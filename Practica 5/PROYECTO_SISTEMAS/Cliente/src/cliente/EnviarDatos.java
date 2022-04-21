package cliente;
import java.io.*;
/**
 *
 * @author saulg
 */
//Agregamos el serializable para poder enviar los datos por la red
class EnviarDatos implements Serializable{
    private String usuario, ip, msg;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
}
