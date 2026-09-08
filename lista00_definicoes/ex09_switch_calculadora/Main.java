package ex09_switch_calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.println("Escolha a operacao:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Opcao: ");
        int opcao = sc.nextInt();

        // conjunto pequeno e conhecido de valores discretos (1, 2, 3, 4).
        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (a + b));
                break;
            case 2:
                System.out.println("Resultado: " + (a - b));
                break;
            case 3:
                System.out.println("Resultado: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Erro: divisao por zero");
                } else {
                    System.out.println("Resultado: " + (a / b));
                }
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        sc.close();
    }
}
