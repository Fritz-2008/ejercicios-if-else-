import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass = sc.next();

        if (pass.length() < 8) {
            System.out.println("Faltan caracteres");
        }
        if (!pass.matches(".*[A-Z].*")) {
            System.out.println("Falta mayúscula");
        }
        if (!pass.matches(".*[0-9].*")) {
            System.out.println("Falta número");
        }
        if (!pass.matches(".*[!@#$%^&*].*")) {
            System.out.println("Falta símbolo");
        }
    }
}
