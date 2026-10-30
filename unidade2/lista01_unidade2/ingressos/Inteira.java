package ingressos;

public class Inteira extends Ingresso {

    public Inteira(String evento, double precoBase) {
        super(evento, precoBase);
    }

    @Override
    public String getTipo() {
        return "Inteira";
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase();
    }
}
