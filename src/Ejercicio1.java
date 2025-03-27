import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();

        System.out.println("Bienvenido al sistema " + nombre);

        leer.close();
    }
}