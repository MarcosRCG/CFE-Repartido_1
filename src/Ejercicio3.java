import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el año actual:");
        int anioActual = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento:");
        int anioNacimiento = leer.nextInt();

        System.out.println("Su edad es: " + (anioActual - anioNacimiento) + " años.");

        leer.close();
    }
}
