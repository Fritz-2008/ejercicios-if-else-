import java.util.Scanner;

public class Transporte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distancia = sc.nextDouble();

        String tipo = sc.next(); // estudiante, adulto, mayor
        String horario = sc.next(); // normal, nocturno

        double costo = distancia * 1.5;

        if (tipo.equals("estudiante")) {
            costo *= 0.5;
        } else if (tipo.equals("mayor")) {
            costo *= 0.7;
        }

        if (horario.equals("nocturno")) {
            costo *= 1.2;
        }

        System.out.println("Costo: " + costo);
    }
}
