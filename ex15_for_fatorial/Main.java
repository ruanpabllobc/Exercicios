package ex15_for_fatorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro nao negativo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Nao existe fatorial de numero negativo.");
            sc.close();
            return;
        }

        // 'fatorial' acumula um PRODUTO, entao comeca em 1 (elemento neutro
        // da multiplicacao). Isso ja cobre os casos 0! = 1 e 1! = 1.
        long fatorial = 1;

        // comeca em 2 porque multiplicar por 1 nao muda o resultado
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(n + "! = " + fatorial);

        sc.close();
    }
}
