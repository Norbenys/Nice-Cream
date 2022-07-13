
public class Cola {

    NodoCola primero, ultimo;
    Helados h = new Helados();
    Pila p = new Pila();
    int precio;

    boolean colaVacia() {
        return primero == null;
    }

    void encolar(String nombre, int opcionHelado, int opcionSabor, int opcionTopping) {
        NodoCola nuevo = new NodoCola(nombre, opcionHelado, opcionSabor, opcionTopping);
        if (colaVacia()) {
            primero = nuevo;
            ultimo = primero;
        } else {
            ultimo.sig = nuevo;
            ultimo = ultimo.sig;
        }

    }

    NodoCola desencolar() {
        if (!colaVacia()) {
            NodoCola aux = new NodoCola(primero.nombre, primero.opcionHelado, primero.opcionSabor, primero.opcionTopping);
            if (primero == ultimo) {
                primero = null;
                ultimo = primero;
            } else {
                primero = primero.sig;
            }
            return aux;
        } else {
            System.out.println("¡La cola esta vacía!");
            return null;
        }

    }

    void mostrar() {
        NodoCola mostrar = primero;
        System.out.println("Los datos de la cola son: ");
        while (mostrar != null) {
            System.out.print(mostrar.nombre + " - " + mostrar.opcionHelado + " - " + mostrar.opcionSabor + " - " + mostrar.opcionTopping);
            System.out.println("");
            mostrar = mostrar.sig;
        }
        System.out.println("");
    }

    void compraSabor() {
        int opcionHelado = 1;

        switch (opcionHelado) {
            case 1:
                p.ingresarSabor(h.Chocolate());
                precio++;
                p.precioGuardar++;
                break;
            case 2:
                p.ingresarSabor(h.Mantecado());
                precio++;
                p.precioGuardar++;
                break;
            case 3:
                p.ingresarSabor(h.Fresa());
                precio++;
                p.precioGuardar++;
                break;
            case 4:
                p.ingresarSabor(h.Mora());
                precio++;
                p.precioGuardar++;
                break;
            case 5:
                p.ingresarSabor(h.Kiwi());
                precio++;
                p.precioGuardar++;
                break;
            case 6:
                p.ingresarSabor(h.Parchita());
                precio++;
                p.precioGuardar++;
                break;
            default:
        }

    }

    void compraTopping() {
        int opcionHelado = 2;
        switch (opcionHelado) {
            case 1:
                p.ingresarSabor(h.SiropeDeChocolate());
                precio++;
                p.precioGuardar++;
                break;
            case 2:
                p.ingresarSabor(h.SiropeDeFresa());
                precio++;
                p.precioGuardar++;
                break;
            case 3:
                p.ingresarSabor(h.SiropeDeCaramelo());
                precio++;
                p.precioGuardar++;
                break;
            case 4:
                p.ingresarSabor(h.Arequipe());
                precio++;
                p.precioGuardar++;
                break;
            case 5:
                p.ingresarSabor(h.Nutella());
                precio++;
                p.precioGuardar++;
                break;
            case 6:
                p.ingresarSabor(h.Cereales());
                precio++;
                p.precioGuardar++;
                break;
            case 7:
                p.ingresarSabor(h.Galletas());
                precio++;
                p.precioGuardar++;
                break;
        }
    }

}
