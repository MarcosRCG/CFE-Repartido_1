import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = leer.nextInt();

        leer.nextLine(); // Al presionar Enter después de nextInt() el salto de línea no me permitía ingresar la ciudad. Por lo que se agrega este paso para solucionar el problema.

        System.out.println("Ingrese su ciudad:");
        String ciudad = leer.nextLine();

        System.out.println("Hola " + nombre + ", tenés " + edad + " años y vivís en " + ciudad + ".");

        leer.close();
    }
}
