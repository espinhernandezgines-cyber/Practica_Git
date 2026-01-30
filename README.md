# Mi Proyecto Java
import java.util.Date; // Importante añadir el import arriba

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFecha();
    }

    public static void mostrarFecha() {
        System.out.println("Fecha actual: " + new Date());
    }
}
