
public class NodoCola {

    String nombre;
    int opcionHelado;
    int opcionSabor;
    int opcionTopping;
    NodoCola sig;

    public NodoCola(String nombre, int opcionHelado, int opcionSabor, int opcionTopping) {
        this.nombre = nombre;
        this.opcionHelado = opcionHelado;
        this.opcionSabor = opcionSabor;
        this.opcionTopping = opcionTopping;
    }

    public NodoCola() {
    }

}
