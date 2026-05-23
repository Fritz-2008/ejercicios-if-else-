
import java.util.Scanner;

public class Becas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Ingresos bajos (true/false): ");
        boolean bajos = sc.nextBoolean();

        System.out.print("Cursos desaprobados: ");
        int desaprobados = sc.nextInt();

        if (promedio >= 16 && bajos && desaprobados == 0) {
            System.out.println("Beca completa");
        } else if ((promedio >= 14 && bajos) || desaprobados <= 1) {
            System.out.println("Beca parcial");
        } else {
            System.out.println("Sin beca");
        }
    }
}
