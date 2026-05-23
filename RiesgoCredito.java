
import java.util.Scanner;

public class RiesgoCredito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingreso mensual: ");
        double ingreso = sc.nextDouble();
        sc.nextLine();

        System.out.print("Historial (bueno, regular, malo): ");
        String historial = sc.nextLine().toLowerCase();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        if (historial.equals("bueno")) {
            if (ingreso > 3000 && edad > 25) {
                System.out.println("Riesgo Bajo");
            } else {
                System.out.println("Riesgo Medio");
            }
        } else if (historial.equals("regular")) {
            if (ingreso > 2000) {
                System.out.println("Riesgo Medio");
            } else {
                System.out.println("Riesgo Alto");
            }
        } else {
            System.out.println("Riesgo Alto");
        }
    }
}
