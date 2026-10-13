import java.util.ArrayList;

public class ListaCompras {
    private ArrayList<String> itens;

    public ListaCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public void removerItem(String item) {
        itens.remove(item);
    }

    public int quantidadeItens() {
        return itens.size();
    }

    public void substituirItem(int posicao, String novoItem) {
        itens.set(posicao, novoItem);
    }

    public void limpar() {
        itens.clear();
    }

    public void exibir() {
        if (itens.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for (int i = 0; i < itens.size(); i++) {
                System.out.println(i + " - " + itens.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();
        lista.adicionarItem("Arroz");
        lista.adicionarItem("Feijão");
        lista.adicionarItem("Café");
        lista.adicionarItem("Leite");
        lista.exibir();
        System.out.println("Total de itens: " + lista.quantidadeItens());

        System.out.println();
        lista.removerItem("Café");
        lista.substituirItem(0, "Arroz integral");
        lista.exibir();
        System.out.println("Total de itens: " + lista.quantidadeItens());

        System.out.println();
        lista.limpar();
        lista.exibir();
    }
}
