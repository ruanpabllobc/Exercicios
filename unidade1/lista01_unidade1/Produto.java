public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.5, 100);
        Produto p2 = new Produto("Caderno", 15.0, 30);

        System.out.println(p1.getNome() + " - R$" + p1.getPreco() + " - " + p1.getQuantidade() + " un.");
        System.out.println(p2.getNome() + " - R$" + p2.getPreco() + " - " + p2.getQuantidade() + " un.");
    }
}