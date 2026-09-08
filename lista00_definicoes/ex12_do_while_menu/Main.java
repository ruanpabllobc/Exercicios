package ex12_do_while_menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        // do/while: o corpo executa PELO MENOS UMA VEZ, porque a condicao
        // so e avaliada no FIM da repeticao. Ideal para menus.
        do {
            System.out.println("=== MENU ===");
            System.out.println("1 - Dizer ola");
            System.out.println("2 - Mostrar uma dica");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println(">> Ola!");
            } else if (opcao == 2) {
                System.out.println(">> Dica: teste seu codigo com valores extremos.");
            } else if (opcao == 0) {
                System.out.println(">> Saindo...");
            } else {
                System.out.println(">> Opcao invalida.");
            }

            System.out.println();
        } while (opcao != 0);

        sc.close();
    }
}
