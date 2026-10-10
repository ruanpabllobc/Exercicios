public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public double calcularBonus() {
        if (getSalario() < 1000) {
            return getSalario() * 0.10;
        } else if (getSalario() <= 3000) {
            return getSalario() * 0.05;
        } else {
            return getSalario() * 0.02;
        }
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 999);
        System.out.println("Bônus: " + f.calcularBonus());
    }
}