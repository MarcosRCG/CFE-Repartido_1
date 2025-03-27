import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo en centímetros:");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectángulo en centímetros:");
        double altura = leer.nextDouble();

        System.out.println("El área del rectángulo es de: " + (base * altura) + " cm.");
        leer.close();
    }
}
