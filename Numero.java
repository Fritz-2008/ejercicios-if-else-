
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // positivo, negativo o cero
        if (n > 0) System.out.println("Positivo");
        else if (n < 0) System.out.println("Negativo");
        else System.out.println("Cero");

        // par o impar
        if (n % 2 == 0) System.out.println("Par");
        else System.out.println("Impar");

        // múltiplos
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Múltiplo de 3 y 5");
        } else if (n % 3 == 0) {
            System.out.println("Múltiplo de 3");
        } else if (n % 5 == 0) {
            System.out.println("Múltiplo de 5");
        }
    }
}
