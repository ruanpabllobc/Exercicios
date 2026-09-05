package ex11_while_soma;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;

        System.out.print("Digite um numero (0 para encerrar): ");
        int numero = sc.nextInt();

        // while: a condicao e testada ANTES de cada repeticao.
        // Se o primeiro numero ja for 0, o corpo do laco nem executa.
        while (numero != 0) {
            soma += numero;
            quantidade++;

            System.out.print("Digite um numero (0 para encerrar): ");
            numero = sc.nextInt();
        }

        System.out.println("Quantidade de numeros somados: " + quantidade);
        System.out.println("Soma total: " + soma);

        sc.close();
    }
}
