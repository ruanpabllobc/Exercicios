package ex13_for_tabuada;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero para a tabuada: ");
        int n = sc.nextInt();

        // for (inicializacao; condicao; incremento)
        // i comeca em 1, o laco repete enquanto i <= 5 e i cresce de 1 em 1.
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
