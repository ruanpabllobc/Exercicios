package formas;

public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return this.base; }
    public double getAltura() { return this.altura; }

    @Override
    public double calcularArea() {
        return this.base * this.altura / 2;
    }
}
