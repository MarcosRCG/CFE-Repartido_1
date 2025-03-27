import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = leer.nextInt();

        System.out.println("Resultado de la suma: " + (num1 + num2));

        leer.close();
    }
}
