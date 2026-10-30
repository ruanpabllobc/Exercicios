import java.util.ArrayList;

public class ListaCompras {
    private ArrayList<String> itens;

    public ListaCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        if (this.itens.contains(item)) {
            System.out.println(item + " ja esta na lista");
        } else {
            this.itens.add(item);
        }
    }

    public void removerItem(String item) {
        if (!this.itens.remove(item)) {
            System.out.println(item + " nao esta na lista");
        }
    }

    public int quantidadeItens() {
        return this.itens.size();
    }

    public void substituirItem(int posicao, String novoItem) {
        if (posicao < 0 || posicao >= this.itens.size()) {
            System.out.println("Posicao invalida: " + posicao);
        } else {
            this.itens.set(posicao, novoItem);
        }
    }

    public void moverParaTopo(String item) {
        if (this.itens.remove(item)) {
            this.itens.add(0, item);
        } else {
            System.out.println(item + " nao esta na lista");
        }
    }

    public void limpar() {
        this.itens.clear();
    }

    public void exibir() {
        if (this.itens.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for (int i = 0; i < this.itens.size(); i++) {
                System.out.println(i + " - " + this.itens.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();
        lista.adicionarItem("Arroz");
        lista.adicionarItem("Feijao");
        lista.adicionarItem("Cafe");
        lista.adicionarItem("Leite");
        lista.adicionarItem("Arroz");
        lista.exibir();
        System.out.println("Total de itens: " + lista.quantidadeItens());

        System.out.println();
        lista.removerItem("Cafe");
        lista.removerItem("Acucar");
        lista.substituirItem(0, "Arroz integral");
        lista.substituirItem(5, "Pao");
        lista.exibir();
        System.out.println("Total de itens: " + lista.quantidadeItens());

        System.out.println();
        lista.moverParaTopo("Leite");
        lista.moverParaTopo("Pao");
        lista.exibir();

        System.out.println();
        lista.limpar();
        lista.exibir();
    }
}
