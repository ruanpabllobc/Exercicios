import java.util.Scanner;

public class Vetor {
    private int[] valores;

    public Vetor(int[] valores) {
        this.valores = valores;
    }

    public void exibirInvertido() {
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }

    public int contarPares() {
        int pares = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores deseja digitar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        int[] dados = new int[quantidade];

        for (int i = 0; i < dados.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            dados[i] = sc.nextInt();
            sc.nextLine();
        }

        Vetor v = new Vetor(dados);
        System.out.println("Valores em ordem inversa:");
        v.exibirInvertido();
        System.out.println("Quantidade de pares: " + v.contarPares());

        sc.close();
    }
}
