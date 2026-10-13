import java.util.ArrayList;

public class ListaNumeros {
    private ArrayList<Integer> valores;

    public ListaNumeros() {
        this.valores = new ArrayList<>();
    }

    public void adicionar(int valor) {
        valores.add(valor);
    }

    public int quantidade() {
        return valores.size();
    }

    public void exibir() {
        for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i));
        }
    }

    public int somar() {
        int soma = 0;
        for (int i = 0; i < valores.size(); i++) {
            soma += valores.get(i);
        }
        return soma;
    }

    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros();
        lista.adicionar(4);
        lista.adicionar(8);
        lista.adicionar(15);
        lista.adicionar(16);
        lista.adicionar(23);
        lista.adicionar(42);
        lista.exibir();
        System.out.println("Soma: " + lista.somar());

        lista.adicionar(100);
        System.out.println("Quantidade após adicionar o 100: " + lista.quantidade());
        System.out.println("Nova soma: " + lista.somar());
    }
}
