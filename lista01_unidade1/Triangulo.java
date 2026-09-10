public class Triangulo {
    private double ladoA, ladoB, ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() { return ladoA; }
    public void setLadoA(double ladoA) { this.ladoA = ladoA; }
    public double getLadoB() { return ladoB; }
    public void setLadoB(double ladoB) { this.ladoB = ladoB; }
    public double getLadoC() { return ladoC; }
    public void setLadoC(double ladoC) { this.ladoC = ladoC; }

    public String classificar() {
        if (getLadoA() == getLadoB() && getLadoB() == getLadoC()) {
            return "Equilátero";
        } else if (getLadoA() == getLadoB() || getLadoB() == getLadoC() || getLadoA() == getLadoC()) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo(5, 5, 8);
        System.out.println(t.classificar());
    }
}
