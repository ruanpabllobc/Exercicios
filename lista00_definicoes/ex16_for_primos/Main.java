package ex16_for_primos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Listar primos ate: ");
        int n = sc.nextInt();

        System.out.println("Numeros primos de 2 ate " + n + ":");

        // for EXTERNO: percorre cada candidato de 2 ate n
        for (int num = 2; num <= n; num++) {
            boolean primo = true;

            // for INTERNO: procura algum divisor de 'num' entre 2 e num-1
            for (int div = 2; div < num; div++) {
                if (num % div == 0) {
                    primo = false;
                    break; // achou um divisor: nao precisa testar os outros
                }
            }

            if (primo) {
                System.out.print(num + " ");
            }
        }

        System.out.println();

        sc.close();
    }
}
