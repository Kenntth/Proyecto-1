/**
 * Clase ticket ayudara a la creacion de objetos en el main
 */
public class ticket {
    /**
     * Parametros de la clase ticket
     */
    public String nit;
public String problema;
public String estado;
public int id;

    /**
     * Constructor limpio de de la clase ticket
     */
    public ticket() {
estado="creado";

    }

    /**
     * Constructor inicializado con parametros
     * @param nit
     * @param problema
     * @param estado
     * @param id
     */
    public ticket(String nit, String problema, String estado, int id) {
        this.nit = nit;
        this.problema = problema;
        this.estado = estado;
        this.id = id;
    }

    /**
     * Setter y getter de los parametros
     * @return salida de la infomacion
     */
    public String getNit() {
        return nit;
    }

    public void setNit(String n) {
        this.nit = nit;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ticket{" +
                "nit='" + nit + '\'' +
                ", problema='" + problema + '\'' +
                ", estado='" + estado + '\'' +
                ", id=" + id +
                '}';
    }
}
