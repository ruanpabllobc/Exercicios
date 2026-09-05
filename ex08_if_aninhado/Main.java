package ex08_if_aninhado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.print("c: ");
        int c = sc.nextInt();

        int maior;

        // if aninhado: o segundo if so e avaliado depois de resolver o primeiro
        if (a >= b)  {
            if (a >= c) {
                maior = a;
            } else {
                maior = c;
            }
        } else {
            if (b >= c) {
                maior = b;
            } else {
                maior = c;
            }
        }

        System.out.println("Maior: " + maior);

        sc.close();
    }
}
