package lista01_unidade1;

import java.util.Scanner;

public class Matriz {
    private int[][] valores;

    public Matriz(int[][] valores) {
        this.valores = valores;
    }

    public int[][] getValores() { return valores; }
    public void setValores(int[][] valores) { this.valores = valores; }

    public void imprimir() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(getValores()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] dados = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                dados[i][j] = sc.nextInt();
            }
        }

        Matriz m = new Matriz(dados);
        m.imprimir();

        sc.close();
    }
}