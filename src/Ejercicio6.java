import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el precio del primer producto:");
        double producto1 = leer.nextDouble();
        System.out.println("Ingrese el precio del segundo producto:");
        double producto2 = leer.nextDouble();
        System.out.println("Ingrese el precio del tercer producto:");
        double producto3 = leer.nextDouble();

        double total = producto1 + producto2 + producto3;
        double totalFinal = total * 1.22;

        System.out.println("Precio total sin IVA: $" + total);
        System.out.println("Precio total final con IVA: $" + totalFinal);

        leer.close();
    }
}
