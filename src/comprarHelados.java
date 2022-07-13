
import java.io.IOException;
import java.util.Scanner;

public class comprarHelados {
    
    public static final String ANSI_PURPLE ="\u001B[35m";
    public static final String ANSI_RESET= "\u001B[0m";
    public static final String ANSI_CYAN ="\u001B[36m";

    Helados h = new Helados();
    Pila p = new Pila();
    int precioSabor, precioTopping;
    int precio;
    NodoCola n = new NodoCola();

    void comprar() throws IOException {

        p.ingresarSabor("Conito");
        int opcionHelado;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println(ANSI_CYAN+"- - - - - - - - - - - - - - - - "+ANSI_RESET);
            System.out.println("[1] - Elegir el sabor: ");
            System.out.println("[2] - Elegir el topping: ");
            System.out.println("[3] - Comprar helado.");
            opcionHelado = teclado.nextInt();

            switch (opcionHelado) {
                case 1:
                    sabor();
                    break;
                case 2:
                    topping();
                    break;
                case 3:
                    precio = precioSabor + precioTopping;
                    System.out.println(ANSI_CYAN+"- - - - - - - - - - - - - - - - "+ANSI_RESET);
                    p.mostrarHelado();
                    System.out.println("Precio del helado:" + precio + "$");
                    System.out.println(ANSI_CYAN+"- - - - - - - - - - - - - - - - "+ANSI_RESET);
                    p.vaciarPila();
                    precio = 0;
                    precioSabor = 0;
                    precioTopping = 0;
                    opcionHelado = 3;
                    break;
                default:
                    System.err.println("Por favor, ingrese un número del 1 al 3.");
            }
        } while (opcionHelado != 3);

    }

    void limiteDeSabor() {
        if (precioSabor > 3) {
            System.err.println("¡Solo se pueden agregar hasta tres sabores a la barquilla!");
            p.quitarHelado();
            p.precioGuardar--;
            precioSabor--;
        }
    }

    void limiteDeTopping() {
        if (precioTopping > 2) {
            System.err.println("¡Solo se pueden agregar hasta dos topping a la barquilla!");
            p.quitarHelado();
            p.precioGuardar--;
            precioTopping--;
        }
    }

    void sabor() {
        int opcionHelado;
        Scanner teclado = new Scanner(System.in);
        System.out.println(ANSI_CYAN+"- - - - - - - - - - - - - - - - "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"- - - Sabores Disponibles - - - "+ANSI_RESET);
        System.out.println("[1] - Chocolate");
        System.out.println("[2] - Mantecado");
        System.out.println("[3] - Fresa");
        System.out.println("[4] - Mora");
        System.out.println("[5] - Kiwi");
        System.out.println("[6] - Parchita");
        System.out.println("¿Qué sabor desea?");
        opcionHelado = teclado.nextInt();

        switch (opcionHelado) {
            case 1:
                p.ingresarSabor(h.Chocolate());
                precioSabor++;
                limiteDeSabor();
                p.precioGuardar++;
                break;
            case 2:
                p.ingresarSabor(h.Mantecado());
                precioSabor++;
                limiteDeSabor();
                p.precioGuardar++;
                break;
            case 3:
                p.ingresarSabor(h.Fresa());
                precioSabor++;
                limiteDeSabor();
                p.precioGuardar++;
                break;
            case 4:
                p.ingresarSabor(h.Mora());
                precioSabor++;
                limiteDeSabor();
                p.precioGuardar++;
                break;
            case 5:
                p.ingresarSabor(h.Kiwi());
                precioSabor++;
                limiteDeSabor();
                p.precioGuardar++;
                break;
            case 6:
                p.ingresarSabor(h.Parchita());
                precioSabor++;
                limiteDeSabor();
                p.precioGuardar++;
                break;
            default:
                System.err.println("Por favor, ingrese un número del 1 al 6.");
        }

    }

    void topping() {
        int opcionHelado;
        Scanner teclado = new Scanner(System.in);
        System.out.println(ANSI_CYAN+"- - - - - - - - - - - - - - - - "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"- - - Toppings Disponibles - - - "+ANSI_RESET);
        System.out.println("[1] - Sirope de chocolate");
        System.out.println("[2] - Sirope de fresa");
        System.out.println("[3] - Sirope de caramelo");
        System.out.println("[4] - Arequipe");
        System.out.println("[5] - Nutella");
        System.out.println("[6] - Cereales");
        System.out.println("[7] - Galletas");
        System.out.println("¿Qué topping desea?");
        opcionHelado = teclado.nextInt();

        switch (opcionHelado) {
            case 1:
                p.ingresarSabor(h.SiropeDeChocolate());
                precioTopping++;
                limiteDeTopping();
                p.precioGuardar++;
                break;
            case 2:
                p.ingresarSabor(h.SiropeDeFresa());
                precioTopping++;
                limiteDeTopping();
                p.precioGuardar++;
                break;
            case 3:
                p.ingresarSabor(h.SiropeDeCaramelo());
                precioTopping++;
                limiteDeTopping();
                p.precioGuardar++;
                break;
            case 4:
                p.ingresarSabor(h.Arequipe());
                precioTopping++;
                limiteDeTopping();
                p.precioGuardar++;
                break;
            case 5:
                p.ingresarSabor(h.Nutella());
                precioTopping++;
                limiteDeTopping();
                p.precioGuardar++;
                break;
            case 6:
                p.ingresarSabor(h.Cereales());
                precioTopping++;
                limiteDeTopping();
                p.precioGuardar++;
                break;
            case 7:
                p.ingresarSabor(h.Galletas());
                precioTopping++;
                limiteDeTopping();
                p.precioGuardar++;
                break;
            default:
                System.err.println("Por favor, ingrese un número del 1 al 7.");
        }
    }

}
