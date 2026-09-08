package lista01_unidade1;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double calcularArea() {
        return getLargura() * getAltura();
    }

    public static void main(String[] args) {
        Retangulo r = new Retangulo(5, 3);
        System.out.println("Área: " + r.calcularArea());
    }
}