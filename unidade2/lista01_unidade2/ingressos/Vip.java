package ingressos;

public class Vip extends Ingresso {
    private double adicional;

    public Vip(String evento, double precoBase, double adicional) {
        super(evento, precoBase);
        this.adicional = adicional;
    }

    public double getAdicional() { return this.adicional; }

    @Override
    public String getTipo() {
        return "VIP";
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() + this.adicional;
    }
}
