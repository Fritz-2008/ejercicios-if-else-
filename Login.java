
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String passCorrecto = "1234";

        int intentos = 0;

        while (intentos < 3) {
            System.out.print("Usuario: ");
            String user = sc.next();

            System.out.print("Contraseña: ");
            String pass = sc.next();

            if (user.equals(usuarioCorrecto) && pass.equals(passCorrecto)) {
                System.out.println("Acceso concedido");
                return;
            } else {
                System.out.println("Datos incorrectos");
                intentos++;
            }
        }

        System.out.println("Cuenta bloqueada");
    }
}
