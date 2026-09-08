package lista01_unidade1;

public class Estoque {
    private String nomeProduto;
    private int quantidadeMinima;
    private int quantidadeAtual;

    public Estoque(String nomeProduto, int quantidadeMinima, int quantidadeAtual) {
        this.nomeProduto = nomeProduto;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeAtual = quantidadeAtual;
    }

    public String getNomeProduto() { return nomeProduto; }
    public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }
    public int getQuantidadeMinima() { return quantidadeMinima; }
    public void setQuantidadeMinima(int quantidadeMinima) { this.quantidadeMinima = quantidadeMinima; }
    public int getQuantidadeAtual() { return quantidadeAtual; }
    public void setQuantidadeAtual(int quantidadeAtual) { this.quantidadeAtual = quantidadeAtual; }

    public boolean precisaReabastecer() {
        return getQuantidadeAtual() < getQuantidadeMinima();
    }

    public void simularVendas(int dias, int vendasPorDia) {
        int dia = 1;
        while (dia <= dias && getQuantidadeAtual() > 0) {
            setQuantidadeAtual(getQuantidadeAtual() - vendasPorDia);
            System.out.println("Dia " + dia + " - Estoque: " + getQuantidadeAtual());
            dia++;
        }
    }

    public static void main(String[] args) {
        Estoque e = new Estoque("Parafuso", 20, 50);
        e.simularVendas(10, 5);
        System.out.println("Precisa reabastecer? " + e.precisaReabastecer());
    }
}
