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

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getValor() { return valor; }

    public boolean ehIsento() {
        return ano < 2005;
    }

    public double calcularIPVA() {
        if (ehIsento()) {
            return 0;
        }
        return valor * 4 / 100;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano;
    }
}
