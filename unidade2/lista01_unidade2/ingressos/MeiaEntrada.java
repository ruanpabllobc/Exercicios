package ingressos;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(String evento, double precoBase) {
        super(evento, precoBase);
    }

    @Override
    public String getTipo() {
        return "Meia-entrada";
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() / 2;
    }
}
