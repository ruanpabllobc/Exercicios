package veiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    public Veiculo(String marca, String modelo, int ano, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getMarca() { return this.marca; }
    public String getModelo() { return this.modelo; }
    public int getAno() { return this.ano; }
    public double getValor() { return this.valor; }

    public boolean ehIsento() {
        return this.ano < 2005;
    }

    public double calcularIPVA() {
        if (ehIsento()) {
            return 0;
        }
        return this.valor * 4 / 100;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + " | Modelo: " + this.modelo + " | Ano: " + this.ano;
    }
}
