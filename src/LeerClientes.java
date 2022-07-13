
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerClientes {

    FileReader fr;

    void leer(Cola cola) throws IOException {
        fr = new FileReader("Clientes.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(" ");
            String nombre = datos[0];
            int opcionHelado = Integer.parseInt(datos[1]);
            int opcionSabor = Integer.parseInt(datos[2]);
            int opcionTopping = Integer.parseInt(datos[3]);
            //lis.ingresar(nombre, apellido, edad);
            cola.encolar(nombre, opcionHelado, opcionSabor, opcionTopping);
        }
    }
}
