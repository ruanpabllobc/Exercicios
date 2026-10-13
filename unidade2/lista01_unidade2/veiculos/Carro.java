package veiculos;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() { return numeroPortas; }

    @Override
    public String toString() {
        return super.toString() + "\nPortas: " + numeroPortas;
    }
}
