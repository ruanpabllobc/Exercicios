package banco;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        saldo += valor;
    }

    // Conta comum só pode usar o próprio saldo
    public double saldoDisponivel() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor > saldoDisponivel()) {
            return false;
        }
        saldo -= valor;
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
        return titular + ": R$ " + saldo;
    }
}
