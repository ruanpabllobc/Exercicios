package banco;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() { return this.titular; }
    public double getSaldo() { return this.saldo; }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Conta comum so pode usar o proprio saldo
    public double saldoDisponivel() {
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if (valor > saldoDisponivel()) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.titular + ": R$ " + this.saldo;
    }
}
