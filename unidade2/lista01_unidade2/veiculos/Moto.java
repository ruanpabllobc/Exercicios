package veiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, double valor, int cilindradas) {
        super(marca, modelo, ano, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() { return this.cilindradas; }

    @Override
    public double calcularIPVA() {
        // a isencao ja e tratada na versao de Veiculo
        if (this.cilindradas <= 160) {
            return super.calcularIPVA() / 2;
        }
        return super.calcularIPVA();
    }

    @Override
    public String toString() {
        return super.toString() + "\nCilindradas: " + this.cilindradas;
    }
}
