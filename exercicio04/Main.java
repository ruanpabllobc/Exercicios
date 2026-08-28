package exercicio04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        // Operador ternario: condicao ? valorSeVerdadeiro : valorSeFalso
        String resultado = (media >= 6) ? "Aprovado" : "Reprovado";

        System.out.println("Media: " + media);
        System.out.println("Situacao: " + resultado);

        sc.close();
    }
}