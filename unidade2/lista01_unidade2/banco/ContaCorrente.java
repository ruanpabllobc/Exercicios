package banco;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() { return this.limite; }

    @Override
    public double saldoDisponivel() {
        return getSaldo() + this.limite;
    }

    @Override
    public String toString() {
        return super.toString() + " (limite: R$ " + this.limite + ")";
    }
}
