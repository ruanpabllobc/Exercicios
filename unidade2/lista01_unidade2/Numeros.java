public class Numeros {
    private int[] valores;

    public Numeros(int[] valores) {
        this.valores = valores;
    }

    public void exibir() {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

    public int somar() {
        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] lista = {4, 8, 15, 16, 23, 42};
        Numeros n = new Numeros(lista);
        n.exibir();
        System.out.println("Soma: " + n.somar());
    }
}
