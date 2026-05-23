
import java.util.Scanner;

public class Rendimiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int puntualidad = sc.nextInt();
        int productividad = sc.nextInt();
        int cumplimiento = sc.nextInt();

        int promedio = (puntualidad + productividad + cumplimiento) / 3;

        if (promedio >= 90) {
            System.out.println("Excelente");
        } else if (promedio >= 75) {
            System.out.println("Bueno");
        } else if (promedio >= 60) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }
    }
}
