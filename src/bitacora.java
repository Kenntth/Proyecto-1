import java.util.ArrayList;
import java.util.Date;
/**
clase bitacora contiene un arraylist y ciertos metodos que ayudaran al control de datos de RAM
 */
public class bitacora {
    /**
     * Estos son los paramatros que se a asignado en la clase bitacora
     */
    public String nitsoporte;
public String fecha;
public String mensaje;

    ArrayList<Double>bitaco;


    /**
     * Constructor limpio
     */
    public bitacora() {
mensaje="asignado";


    }

    /**
     * constructor inicializado
     * @param nitsoporte
     * @param fecha
     * @param mensaje
     */

    public bitacora(String nitsoporte, String fecha, String mensaje) {
        this.nitsoporte = nitsoporte;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }

    /**
     * setters y getters de los respectivos parametros
     * @return retorno de la informacion almacenada
     */
    public String getNitsoporte() {
        return nitsoporte;
    }

    public void setNitsoporte(String nitsoporte) {
        this.nitsoporte = nitsoporte;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void asignarticket(){



}

    @Override
    public String toString() {
        return "bitacora{" +
                "nitsoporte='" + nitsoporte + '\'' +
                ", fecha='" + fecha + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
