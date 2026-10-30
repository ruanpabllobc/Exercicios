package formas;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        super("Retangulo");
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() { return this.largura; }
    public double getAltura() { return this.altura; }

    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }
}
