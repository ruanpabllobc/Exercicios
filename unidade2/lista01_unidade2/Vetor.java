import java.util.Scanner;

public class Vetor {
    private int[] valores;

    public Vetor(int[] valores) {
        this.valores = valores;
    }

    public void exibir() {
        System.out.print("Valores:");
        for (int i = 0; i < this.valores.length; i++) {
            System.out.print(" " + this.valores[i]);
        }
        System.out.println();
    }

    public int buscarPosicao(int valor) {
        for (int i = 0; i < this.valores.length; i++) {
            if (this.valores[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public boolean estaOrdenado() {
        for (int i = 0; i < this.valores.length - 1; i++) {
            if (this.valores[i] > this.valores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void inverter() {
        int inicio = 0;
        int fim = this.valores.length - 1;
        while (inicio < fim) {
            int aux = this.valores[inicio];
            this.valores[inicio] = this.valores[fim];
            this.valores[fim] = aux;
            inicio++;
            fim--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores deseja digitar? ");
        int quantidade = sc.nextInt();
        int[] dados = new int[quantidade];

        for (int i = 0; i < dados.length; i++) {
            System.out.print("Digite o valor da posicao " + i + ": ");
            dados[i] = sc.nextInt();
        }

        Vetor v = new Vetor(dados);
        v.exibir();
        System.out.println("Esta em ordem crescente? " + v.estaOrdenado());

        System.out.print("Valor a buscar: ");
        int busca = sc.nextInt();
        int posicao = v.buscarPosicao(busca);
        if (posicao == -1) {
            System.out.println(busca + " nao foi encontrado");
        } else {
            System.out.println(busca + " esta na posicao " + posicao);
        }

        System.out.println("Invertendo...");
        v.inverter();
        v.exibir();
        System.out.println("Esta em ordem crescente? " + v.estaOrdenado());

        sc.close();
    }
}
