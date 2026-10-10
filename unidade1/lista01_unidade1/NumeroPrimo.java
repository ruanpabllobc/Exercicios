public class NumeroPrimo {
    private int numero;

    public NumeroPrimo(int numero) {
        this.numero = numero;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public boolean verificarPrimo() {
        if (getNumero() < 2) return false;
        for (int i = 2; i < getNumero(); i++) {
            if (getNumero() % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        NumeroPrimo np = new NumeroPrimo(2);
        System.out.println(np.verificarPrimo());
    }
}