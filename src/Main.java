 
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Briceño, Yohan. uwu
 * Antepaz, Rodny. 
 * Noriega, Norbenys. uwu
 */
public class Main {

    public static final String ANSI_PURPLE ="\u001B[35m";  
    public static final String ANSI_CYAN ="\u001B[36m";
    public static final String ANSI_RESET= "\u001B[0m";
    int dFresa, dChocolate, dMantecado, dKiwi, dParchita, dMora;

    public static void main(String[] args) throws IOException {
        Helados h = new Helados();
        Pila p = new Pila();
        comprarHelados c = new comprarHelados();
        Scanner teclado = new Scanner(System.in);
        int opcionHelado;
        Cola cola = new Cola();
        LeerClientes leer = new LeerClientes();
        NodoCola n = new NodoCola();
        int opcionInicial;
        p.leerVentas(p);
        leer.leer(cola);
        int precio = 0;

        do {
            System.out.println(ANSI_CYAN+"¡BIENVENIDO A LA HELADERÍA "+ANSI_RESET +ANSI_PURPLE+ "NICE CREAM!"+ANSI_RESET);
            System.out.println("[1] - Cargar cola de clientes.");
            System.out.println("[2] - Comprar helado desde el teclado.");
            System.out.println("[3] - Crear archivo de descuento.");
            System.out.println("[4] - Salir.");
            opcionInicial = teclado.nextInt();

            switch (opcionInicial) {

                case 1:
                    if(cola.primero == null){   
                        System.err.println("!Ya no quedan clientes en la cola!");
                    
                    } else{
                    p.ingresarSabor("Conito");
                    int opcionHelados = cola.primero.opcionHelado;
                    int opcionSabor = cola.primero.opcionTopping;
                    int opcionSaborExtra = cola.primero.opcionSabor;
                    //Comienzo del sabor del helado

                    switch (opcionHelados) {
                        case 1:
                            p.ingresarSabor(h.Chocolate());
                            if (opcionSaborExtra == 1) {
                                p.ingresarSabor(h.Chocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 2) {
                                p.ingresarSabor(h.Mantecado());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 3) {
                                p.ingresarSabor(h.Fresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 4) {
                                p.ingresarSabor(h.Mora());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 5) {
                                p.ingresarSabor(h.Kiwi());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 6) {
                                p.ingresarSabor(h.Parchita());
                                precio++;
                                p.precioGuardar++;
                            }
                            if (opcionSabor == 1) {
                                p.ingresarSabor(h.SiropeDeChocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 2) {
                                p.ingresarSabor(h.SiropeDeFresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 3) {
                                p.ingresarSabor(h.SiropeDeCaramelo());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 4) {
                                p.ingresarSabor(h.Arequipe());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 5) {
                                p.ingresarSabor(h.Nutella());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 6) {
                                p.ingresarSabor(h.Cereales());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 7) {
                                p.ingresarSabor(h.Galletas());
                                precio++;
                                p.precioGuardar++;
                            }
                            precio++;
                            p.precioGuardar++;
                            break;
                        case 2:
                            p.ingresarSabor(h.Mantecado());
                            if (opcionSaborExtra == 1) {
                                p.ingresarSabor(h.Chocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 2) {
                                p.ingresarSabor(h.Mantecado());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 3) {
                                p.ingresarSabor(h.Fresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 4) {
                                p.ingresarSabor(h.Mora());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 5) {
                                p.ingresarSabor(h.Kiwi());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 6) {
                                p.ingresarSabor(h.Parchita());
                                precio++;
                                p.precioGuardar++;
                            }
                            if (opcionSabor == 1) {
                                p.ingresarSabor(h.SiropeDeChocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 2) {
                                p.ingresarSabor(h.SiropeDeFresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 3) {
                                p.ingresarSabor(h.SiropeDeCaramelo());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 4) {
                                p.ingresarSabor(h.Arequipe());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 5) {
                                p.ingresarSabor(h.Nutella());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 6) {
                                p.ingresarSabor(h.Cereales());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 7) {
                                p.ingresarSabor(h.Galletas());
                                precio++;
                                p.precioGuardar++;
                            }
                            precio++;
                            p.precioGuardar++;
                            break;
                        case 3:
                            p.ingresarSabor(h.Fresa());
                            if (opcionSaborExtra == 1) {
                                p.ingresarSabor(h.Chocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 2) {
                                p.ingresarSabor(h.Mantecado());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 3) {
                                p.ingresarSabor(h.Fresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 4) {
                                p.ingresarSabor(h.Mora());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 5) {
                                p.ingresarSabor(h.Kiwi());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 6) {
                                p.ingresarSabor(h.Parchita());
                                precio++;
                                p.precioGuardar++;
                            }
                            if (opcionSabor == 1) {
                                p.ingresarSabor(h.SiropeDeChocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 2) {
                                p.ingresarSabor(h.SiropeDeFresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 3) {
                                p.ingresarSabor(h.SiropeDeCaramelo());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 4) {
                                p.ingresarSabor(h.Arequipe());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 5) {
                                p.ingresarSabor(h.Nutella());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 6) {
                                p.ingresarSabor(h.Cereales());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 7) {
                                p.ingresarSabor(h.Galletas());
                                precio++;
                                p.precioGuardar++;
                            }
                            precio++;
                            p.precioGuardar++;
                            break;
                        case 4:
                            p.ingresarSabor(h.Mora());
                            if (opcionSaborExtra == 1) {
                                p.ingresarSabor(h.Chocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 2) {
                                p.ingresarSabor(h.Mantecado());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 3) {
                                p.ingresarSabor(h.Fresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 4) {
                                p.ingresarSabor(h.Mora());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 5) {
                                p.ingresarSabor(h.Kiwi());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 6) {
                                p.ingresarSabor(h.Parchita());
                                precio++;
                                p.precioGuardar++;
                            }
                            if (opcionSabor == 1) {
                                p.ingresarSabor(h.SiropeDeChocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 2) {
                                p.ingresarSabor(h.SiropeDeFresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 3) {
                                p.ingresarSabor(h.SiropeDeCaramelo());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 4) {
                                p.ingresarSabor(h.Arequipe());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 5) {
                                p.ingresarSabor(h.Nutella());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 6) {
                                p.ingresarSabor(h.Cereales());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 7) {
                                p.ingresarSabor(h.Galletas());
                                precio++;
                                p.precioGuardar++;
                            }
                            precio++;
                            p.precioGuardar++;
                            break;
                        case 5:
                            p.ingresarSabor(h.Kiwi());
                            if (opcionSaborExtra == 1) {
                                p.ingresarSabor(h.Chocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 2) {
                                p.ingresarSabor(h.Mantecado());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 3) {
                                p.ingresarSabor(h.Fresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 4) {
                                p.ingresarSabor(h.Mora());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 5) {
                                p.ingresarSabor(h.Kiwi());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 6) {
                                p.ingresarSabor(h.Parchita());
                                precio++;
                                p.precioGuardar++;
                            }
                            if (opcionSabor == 1) {
                                p.ingresarSabor(h.SiropeDeChocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 2) {
                                p.ingresarSabor(h.SiropeDeFresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 3) {
                                p.ingresarSabor(h.SiropeDeCaramelo());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 4) {
                                p.ingresarSabor(h.Arequipe());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 5) {
                                p.ingresarSabor(h.Nutella());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 6) {
                                p.ingresarSabor(h.Cereales());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 7) {
                                p.ingresarSabor(h.Galletas());
                                precio++;
                                p.precioGuardar++;
                            }
                            precio++;
                            p.precioGuardar++;
                            break;
                        case 6:
                            p.ingresarSabor(h.Parchita());
                            if (opcionSaborExtra == 1) {
                                p.ingresarSabor(h.Chocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 2) {
                                p.ingresarSabor(h.Mantecado());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 3) {
                                p.ingresarSabor(h.Fresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 4) {
                                p.ingresarSabor(h.Mora());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 5) {
                                p.ingresarSabor(h.Kiwi());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSaborExtra == 6) {
                                p.ingresarSabor(h.Parchita());
                                precio++;
                                p.precioGuardar++;
                            }
                            if (opcionSabor == 1) {
                                p.ingresarSabor(h.SiropeDeChocolate());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 2) {
                                p.ingresarSabor(h.SiropeDeFresa());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 3) {
                                p.ingresarSabor(h.SiropeDeCaramelo());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 4) {
                                p.ingresarSabor(h.Arequipe());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 5) {
                                p.ingresarSabor(h.Nutella());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 6) {
                                p.ingresarSabor(h.Cereales());
                                precio++;
                                p.precioGuardar++;
                            } else if (opcionSabor == 7) {
                                p.ingresarSabor(h.Galletas());
                                precio++;
                                p.precioGuardar++;
                            }
                            precio++;
                            p.precioGuardar++;
                            break;
                    }
                    cola.desencolar();
                    p.mostrarHelado();
                    p.saberDescuento();
                    p.vaciarPila();
                    break;
                    }
                case 2:
                    do {
                        System.out.println("[1] - Comprar helado.");
                        System.out.println("[2] - Salir.");
                        opcionHelado = teclado.nextInt();

                        switch (opcionHelado) {
                            case 1:
                                c.comprar();
                                break;
                            case 2:
                                opcionHelado = 2;
                                break;
                            default:
                                System.err.println("Por favor, ingrese un número del 1 al 2.");
                        }
                    } while (opcionHelado != 2);
                    break;
                case 3:
                    p.leerVentas(p);
                    p.darValores();
                    p.darValorest();
                    p.saberDescuento();
                    p.saberMenorVendido();
                    p.toppingDescuento();
                    p.saberMenorVendidoTopping();

                    break;
            }

        } while (opcionInicial != 4);

    }

}
