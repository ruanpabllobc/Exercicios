package banco;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() { return limite; }

    @Override
    public double saldoDisponivel() {
        return getSaldo() + limite;
    }

    @Override
    public String toString() {
        return super.toString() + " (limite: R$ " + limite + ")";
    }
}
