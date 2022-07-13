
public class nodo {

    String saborHelado;
    nodo sig;

    public nodo(String saborHelado, nodo sig) {
        this.saborHelado = saborHelado;
        this.sig = sig;
    }

    public nodo(String saborHelado) {
        this.saborHelado = saborHelado;
    }

}
