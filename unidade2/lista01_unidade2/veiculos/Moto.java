package veiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() { return cilindradas; }

    @Override
    public String toString() {
        return super.toString() + "\nCilindradas: " + cilindradas;
    }
}
