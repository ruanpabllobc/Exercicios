package ex14_for_soma_intervalo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inicio do intervalo (A): ");
        int a = sc.nextInt();

        System.out.print("Fim do intervalo (B): ");
        int b = sc.nextInt();

        // 'soma' e um acumulador: guarda o total parcial a cada volta do laco.
        // Precisa comecar em 0, o elemento neutro da adicao.
        int soma = 0;

        for (int i = a; i <= b; i++) {
            soma += i;
        }

        System.out.println("Soma dos inteiros de " + a + " ate " + b + " = " + soma);

        sc.close();
    }
}
