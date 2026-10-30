import java.util.ArrayList;

public class ListaCompras {
    private ArrayList<String> itens;

    public ListaCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        if (itens.contains(item)) {
            System.out.println(item + " já está na lista");
        } else {
            itens.add(item);
        }
    }

    public void removerItem(String item) {
        if (!itens.remove(item)) {
            System.out.println(item + " não está na lista");
        }
    }

    public int quantidadeItens() {
        return itens.size();
    }

    public void substituirItem(int posicao, String novoItem) {
        if (posicao < 0 || posicao >= itens.size()) {
            System.out.println("Posição inválida: " + posicao);
        } else {
            itens.set(posicao, novoItem);
        }
    }

    public void moverParaTopo(String item) {
        if (itens.remove(item)) {
            itens.add(0, item);
        } else {
            System.out.println(item + " não está na lista");
        }
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
        lista.adicionarItem("Arroz");
        lista.exibir();
        System.out.println("Total de itens: " + lista.quantidadeItens());

        System.out.println();
        lista.removerItem("Café");
        lista.removerItem("Açúcar");
        lista.substituirItem(0, "Arroz integral");
        lista.substituirItem(5, "Pão");
        lista.exibir();
        System.out.println("Total de itens: " + lista.quantidadeItens());

        System.out.println();
        lista.moverParaTopo("Leite");
        lista.moverParaTopo("Pão");
        lista.exibir();

        System.out.println();
        lista.limpar();
        lista.exibir();
    }
}
