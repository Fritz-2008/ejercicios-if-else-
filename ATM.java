
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinCorrecto = 1234;
        int intentos = 0;
        double saldo = 1000;

        while (intentos < 3) {
            System.out.print("Ingrese PIN: ");
            int pin = sc.nextInt();

            if (pin == pinCorrecto) {
                System.out.println("Saldo: " + saldo);
                System.out.print("Monto a retirar: ");
                double retiro = sc.nextDouble();

                if (retiro > saldo) {
                    System.out.println("Fondos insuficientes");
                } else if (retiro > 500) {
                    System.out.println("Límite diario excedido");
                } else {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
                }
                return;
            } else {
                intentos++;
                System.out.println("PIN incorrecto");
            }
        }
        System.out.println("Cuenta bloqueada");
    }
}
