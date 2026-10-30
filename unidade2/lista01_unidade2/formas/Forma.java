package formas;

public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public abstract double calcularArea();

    public boolean ehMaiorQue(Forma outra) {
        return calcularArea() > outra.calcularArea();
    }

    @Override
    public String toString() {
        return nome + " - Área: " + calcularArea();
    }
}
