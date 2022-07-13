
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pila {

    nodo D;
    nodo L;
    int dFresa, dChocolate, dMantecado, dKiwi, dParchita, dMora;
    int dSiropedechocolate, dSiropedefresa, dSiropedecaramelo, dtoppingArequipe, dtoppingNutella, dtoppingCereales, dtoppingGalletas;
    PrintWriter pf;
    FileReader fr;
    int precioGuardar;

    boolean pilaVacia() {
        return L == null;
    }

    void ingresarSabor(String sabor) {
        L = new nodo(sabor, L);
    }

    void ingresarSaborParaDescuento(String sabor) {
        D = new nodo(sabor, D);
    }

    void mostrarHelado() throws IOException {
        Cola cola = new Cola();
        comprarHelados c = new comprarHelados();
        if (pilaVacia()) {
            System.err.println("¡No hay helados registrados!");
        } else if (L.saborHelado == "Conito") {
            System.out.println("¡No ha ingresado ningún sabor!");
            System.err.println("Compra no realizada con éxito.");
        } else {
            pf = new PrintWriter(new FileWriter("Ventas.txt", true));
            nodo aux = L;
            pf.append("\nPedido de ");
            while (aux != null) {
                System.out.println(aux.saborHelado);
                pf.append("\n" + aux.saborHelado);
                aux = aux.sig;
            }
            pf.append("\nY su precio fue de " + precioGuardar + "$");
            pf.append("\n");
            pf.close();
            System.out.println("Compra realizada con éxito.");
        }
        precioGuardar = 0;
    }

    nodo quitarHelado() {
        if (!pilaVacia()) {
            nodo aux = new nodo(L.saborHelado);
            if (L == null) {
                L = null;
            } else {
                L = L.sig;
            }
            return aux;
        } else {
            System.out.println("¡La pila esta vacía!");
            return null;
        }
    }

    void vaciarPila() {
        while (!pilaVacia()) {
            quitarHelado();
        }
    }

    void leerVentas(Pila p) throws IOException {
        fr = new FileReader("Ventas.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(" ");
            String nombre = datos[0];
            p.ingresarSaborParaDescuento(nombre);
        }
    }

    void darValores() {
        nodo aux = D;
        while (aux != null) {
            if ("Fresa".equals(aux.saborHelado)) {
                dFresa++;
            } else if ("Mora".equals(aux.saborHelado)) {
                dMora++;
            } else if ("Mantecado".equals(aux.saborHelado)) {
                dMantecado++;
            } else if ("Chocolate".equals(aux.saborHelado)) {
                dChocolate++;
            } else if ("Kiwi".equals(aux.saborHelado)) {
                dKiwi++;
            } else if ("Parchita".equals(aux.saborHelado)) {
                dParchita++;
            }
            aux = aux.sig;
        }
    }
    

    void saberDescuento() throws IOException {
        
        pf = new PrintWriter(new FileWriter("Sabor más vendido.txt", true));

        if (dChocolate > dFresa && dChocolate > dKiwi && dChocolate > dMantecado
                && dChocolate > dMora && dChocolate > dParchita) {
            pf.append("\nEl sabor más vendido fue el de chocolate.");
            pf.close();

        } else if (dFresa > dChocolate && dFresa > dKiwi && dFresa > dMantecado
                && dFresa > dMora && dFresa > dParchita) {
            pf.append("\nEl sabor más vendido fue el de fresa.");
            pf.close();
        } else if (dKiwi > dChocolate && dKiwi > dFresa && dKiwi > dMantecado
                && dKiwi > dMora && dKiwi > dParchita) {
            pf.append("\nEl sabor más vendido fue el de kiwi.");
            pf.close();
        } else if (dMantecado > dChocolate && dMantecado > dKiwi && dMantecado > dFresa
                && dMantecado > dMora && dMantecado > dParchita) {
            pf.append("\nEl sabor más vendido fue el de mantecado.");
            pf.close();
        } else if (dMora > dChocolate && dMora > dKiwi && dMora > dMantecado
                && dMora > dFresa && dMora > dParchita) {
            pf.append("\nEl sabor más vendido fue el de mora.");
            pf.close();
        } else if (dParchita > dChocolate && dParchita > dKiwi && dParchita > dMantecado
                && dParchita > dMora && dParchita > dFresa) {
            pf.append("\nEl sabor más vendido fue el de parchita.");
            pf.close();
        }

    }

    void saberMenorVendido() throws IOException {
        pf = new PrintWriter(new FileWriter("Sabor menos vendido.txt", true));
        if (dChocolate <= dFresa && dChocolate <= dKiwi && dChocolate <= dMantecado
                && dChocolate <= dMora && dChocolate <= dParchita) {
            pf.append("\nEl sabor menos vendido fue el de chocolate.");
            pf.close();

        } else if (dFresa <= dChocolate && dFresa <= dKiwi && dFresa <= dMantecado
                && dFresa <= dMora && dFresa <= dParchita) {
            pf.append("\nEl sabor menos vendido fue el de fresa.");
            pf.close();
        } else if (dKiwi <= dChocolate && dKiwi <= dFresa && dKiwi <= dMantecado
                && dKiwi <= dMora && dKiwi <= dParchita) {
            pf.append("\nEl sabor menos vendido fue el de kiwi.");
            pf.close();
        } else if (dMantecado <= dChocolate && dMantecado <= dKiwi && dMantecado <= dFresa
                && dMantecado <= dMora && dMantecado <= dParchita) {
            pf.append("\nEl sabor menos vendido fue el de mantecado.");
            pf.close();
        } else if (dMora <= dChocolate && dMora <= dKiwi && dMora <= dMantecado
                && dMora <= dFresa && dMora <= dParchita) {
            pf.append("\nEl sabor menos vendido fue el de mora.");
            pf.close();
        } else if (dParchita <= dChocolate && dParchita <= dKiwi && dParchita <= dMantecado
                && dParchita <= dMora && dParchita <= dFresa) {
            pf.append("\nEl sabor menos vendido fue el de parchita.");
            pf.close();
        }
    }

    void darValorest() {
        nodo aux = D;
        while (aux != null) {
            if (null != aux.saborHelado) switch (aux.saborHelado) {
                case "Sirope de chocolate":
                    dSiropedechocolate++;
                    break;
                case "Sirope de fresa":
                    dSiropedefresa++;
                    break;
                case "Sirope de caramelo":
                    dSiropedecaramelo++;
                    break;
                case "Arequipe":
                    dtoppingArequipe++;
                    break;
                case "Nutella":
                    dtoppingNutella++;
                    break;
                case "Cereales":
                    dtoppingCereales++;
                    break;
                case "Galletas":
                    dtoppingGalletas++;
                    break;
                default:
                    break;
            }

            aux = aux.sig;
        }

    }

    void toppingDescuento() throws IOException {
        pf = new PrintWriter(new FileWriter("Topping más vendido.txt", true));

        if (dSiropedechocolate > dSiropedefresa && dSiropedechocolate > dSiropedecaramelo && dSiropedechocolate > dtoppingArequipe
                && dSiropedechocolate > dtoppingNutella && dSiropedechocolate > dtoppingCereales && dSiropedechocolate > dtoppingGalletas) {
            pf.append("\nEl topping más vendido fue el sirope de chocolate.");
            pf.close();

        } else if (dSiropedefresa > dSiropedechocolate && dSiropedefresa > dSiropedecaramelo && dSiropedefresa > dtoppingArequipe
                && dSiropedefresa > dtoppingNutella && dSiropedefresa > dtoppingCereales && dSiropedefresa > dtoppingGalletas) {
            pf.append("\nEl topping más vendido fue el sirope de fresa.");
            pf.close();
        } else if (dSiropedecaramelo > dSiropedechocolate && dSiropedecaramelo > dSiropedefresa && dSiropedecaramelo > dtoppingArequipe
                && dSiropedecaramelo > dtoppingNutella && dSiropedecaramelo > dtoppingCereales && dSiropedecaramelo > dtoppingGalletas) {
            pf.append("\nEl topping más vendido fue el sirope de caramelo.");
            pf.close();
        } else if (dtoppingArequipe > dSiropedechocolate && dtoppingArequipe > dSiropedefresa && dtoppingArequipe > dSiropedecaramelo
                && dtoppingArequipe > dtoppingNutella && dtoppingArequipe > dtoppingCereales && dtoppingArequipe > dtoppingGalletas) {
            pf.append("\nEl topping más vendido fue el caramelo.");
            pf.close();
        } else if (dtoppingNutella > dSiropedechocolate && dtoppingNutella > dSiropedefresa && dtoppingNutella > dSiropedecaramelo
                && dtoppingNutella > dtoppingArequipe && dtoppingNutella > dtoppingCereales && dtoppingNutella > dtoppingGalletas) {
            pf.append("\nEl topping más vendido fue el de nutella.");
            pf.close();
        } else if (dtoppingCereales > dSiropedechocolate && dtoppingCereales > dSiropedefresa && dtoppingCereales > dSiropedecaramelo
                && dtoppingCereales > dtoppingArequipe && dtoppingCereales > dtoppingNutella && dtoppingCereales > dtoppingGalletas) {
            pf.append("\nEl topping más vendido fue el de cereales.");
            pf.close();
        } else if (dtoppingGalletas > dSiropedechocolate && dtoppingGalletas > dSiropedefresa && dtoppingGalletas > dSiropedecaramelo
                && dtoppingGalletas > dtoppingArequipe && dtoppingGalletas > dtoppingNutella && dtoppingGalletas > dtoppingCereales) {
            pf.append("\nEl topping más vendido fue el de galleta.");
            pf.close();
        }
        
    }
    
    void saberMenorVendidoTopping() throws IOException{
        pf = new PrintWriter(new FileWriter("Topping menos vendido.txt", true));
    if (dSiropedechocolate <= dSiropedefresa && dSiropedechocolate <= dSiropedecaramelo && dSiropedechocolate <= dtoppingArequipe
                && dSiropedechocolate <= dtoppingNutella && dSiropedechocolate <= dtoppingCereales && dSiropedechocolate <= dtoppingGalletas) {
            pf.append("\nEl topping menos vendido fue el sirope de chocolate");
            pf.close();

        } else if (dSiropedefresa <= dSiropedechocolate && dSiropedefresa <= dSiropedecaramelo && dSiropedefresa <= dtoppingArequipe
                && dSiropedefresa <= dtoppingNutella && dSiropedefresa <= dtoppingCereales && dSiropedefresa <= dtoppingGalletas) {
            pf.append("\nEl topping menos vendido fue el sirope de fresa.");
            pf.close();
        } else if (dSiropedecaramelo <= dSiropedechocolate && dSiropedecaramelo <= dSiropedefresa && dSiropedecaramelo <= dtoppingArequipe
                && dSiropedecaramelo <= dtoppingNutella && dSiropedecaramelo <= dtoppingCereales && dSiropedecaramelo <= dtoppingGalletas) {
            pf.append("\nEl topping menos vendido fue el sirope de caramelo.");
            pf.close();
        } else if (dtoppingArequipe <= dSiropedechocolate && dtoppingArequipe <= dSiropedefresa && dtoppingArequipe <= dSiropedecaramelo
                && dtoppingArequipe <= dtoppingNutella && dtoppingArequipe <= dtoppingCereales && dtoppingArequipe <= dtoppingGalletas) {
            pf.append("\nEl topping menos vendido fue el caramelo.");
            pf.close();
        } else if (dtoppingNutella <= dSiropedechocolate && dtoppingNutella <= dSiropedefresa && dtoppingNutella <= dSiropedecaramelo
                && dtoppingNutella <= dtoppingArequipe && dtoppingNutella <= dtoppingCereales && dtoppingNutella <= dtoppingGalletas) {
            pf.append("\nEl topping menos vendido fue el de nutella.");
            pf.close();
        } else if (dtoppingCereales <= dSiropedechocolate && dtoppingCereales <= dSiropedefresa && dtoppingCereales <= dSiropedecaramelo
                && dtoppingCereales <= dtoppingArequipe && dtoppingCereales <= dtoppingNutella && dtoppingCereales <= dtoppingGalletas) {
            pf.append("\nEl topping menos vendido fue el de cereales.");
            pf.close();
        } else if (dtoppingGalletas <= dSiropedechocolate && dtoppingGalletas <= dSiropedefresa && dtoppingGalletas <= dSiropedecaramelo
                && dtoppingGalletas <= dtoppingArequipe && dtoppingGalletas <= dtoppingNutella && dtoppingGalletas <= dtoppingCereales) {
            pf.append("\nEl topping menos vendido fue el de galleta.");
            pf.close();
        }
    }

}
