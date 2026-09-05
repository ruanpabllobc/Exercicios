package ex06_if_else_if;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota: ");
        double nota = sc.nextDouble();

        // Primeiro descartamos valores fora do intervalo valido
        if (nota < 0 || nota > 10) {
            System.out.println("Nota invalida");
        } else if (nota >= 9.0) {
            System.out.println("Conceito: A");
        } else if (nota >= 7.0) {
            // so chega aqui se nota < 9.0, entao basta testar o limite de baixo
            System.out.println("Conceito: B");
        } else if (nota >= 5.0) {
            System.out.println("Conceito: C");
        } else if (nota >= 3.0) {
            System.out.println("Conceito: D");
        } else {
            System.out.println("Conceito: E");
        }

        sc.close();
    }
}
