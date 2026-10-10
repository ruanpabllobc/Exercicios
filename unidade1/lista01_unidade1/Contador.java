public class Contador {
    private int limite;

    public Contador(int limite) {
        this.limite = limite;
    }

    public int getLimite(){ return limite; }
    public void setLimite(int limite) { this.limite = limite; }

    public void contarAte() {
        for (int i = 1; i <= getLimite(); i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Contador c = new Contador(10);
        c.contarAte();
    }
}
