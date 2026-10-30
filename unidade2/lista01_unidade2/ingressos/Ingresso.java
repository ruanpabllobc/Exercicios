package ingressos;

public abstract class Ingresso {
    private String evento;
    private double precoBase;

    public Ingresso(String evento, double precoBase) {
        this.evento = evento;
        this.precoBase = precoBase;
    }

    public String getEvento() { return this.evento; }
    public double getPrecoBase() { return this.precoBase; }

    public abstract String getTipo();

    public abstract double calcularPreco();

    @Override
    public String toString() {
        return getTipo() + " - " + this.evento + ": R$ " + calcularPreco();
    }
}
