package exercicio06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        double soma = somaNotas(n1, n2);

        System.out.println("Soma: " + soma);

        sc.close();
    }

    static double somaNotas(double n1, double n2) {
        return n1 + n2;
    }
}
