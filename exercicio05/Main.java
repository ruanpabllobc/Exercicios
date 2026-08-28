package exercicio05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.println("Media: " + media);

        // (util quando a acao precisa de mais de uma linha)
        if (media >= 6) {
            System.out.println("Situacao: Aprovado");
        } else {
            System.out.println("Situacao: Reprovado");
        }

        sc.close();
    }
}