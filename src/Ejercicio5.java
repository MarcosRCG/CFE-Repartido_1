import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celsius:");
        double temperatura = leer.nextDouble();

        System.out.println("Son: " + (temperatura*9/5 + 32) + "° Fahrenheit.");

        leer.close();
    }
}