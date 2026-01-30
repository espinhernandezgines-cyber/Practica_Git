import java.util.Scanner;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fecha actual: " + new Date());
        
        System.out.print("Introduce cuántos usuarios quieres crear: ");
        int num = sc.nextInt();

        Usuario[] misUsuarios = gestionUsuarios(num);

        System.out.println("\n--- Datos de los usuarios creados ---");
        for (Usuario u : misUsuarios) {
            System.out.println("Nombre: " + u.nombre + " " + u.apellidos + " - Email: " + u.email);
        }
    }

    public static Usuario[] gestionUsuarios(int cantidad) {
        Scanner sc = new Scanner(System.in);
        Usuario[] lista = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nUsuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String n = sc.nextLine();
            System.out.print("Apellidos: ");
            String a = sc.nextLine();
            System.out.print("Email: ");
            String e = sc.nextLine();
            
            lista[i] = new Usuario(n, a, e);
        }
        return lista;
    }
}
