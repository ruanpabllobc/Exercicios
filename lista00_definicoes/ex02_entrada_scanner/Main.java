package ex02_entrada_scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos e " + altura + "m de altura.");

        sc.close();
    }
}