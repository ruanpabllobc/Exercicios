package lista01_unidade1;

public class Aluno {
    private double nota1;
    private double nota2;
    private double frequencia;

    public Aluno(double nota1, double nota2, double frequencia) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.frequencia = frequencia;
    }

    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = nota1; }
    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { this.nota2 = nota2; }
    public double getFrequencia() { return frequencia; }
    public void setFrequencia(double frequencia) { this.frequencia = frequencia; }

public void situacao() {
    double media = (getNota1() + getNota2()) / 2;

    boolean atingiuMedia = (media >= 6.0);
    boolean cumpriuFrequencia = (getFrequencia() >= 75);

    if (atingiuMedia && cumpriuFrequencia) {
        System.out.println("Situação: Aprovado");
    } else if (!atingiuMedia && cumpriuFrequencia) {
        System.out.println("Situação: Reprovado por Nota");
    } else if (atingiuMedia) {
        System.out.println("Situação: Reprovado por Falta");
    } else {
        System.out.println("Situação: Reprovado por Nota e Falta");
    }
}
    public static void main(String[] args) {
        Aluno aluno = new Aluno(6.0, 8.0, 80);
        aluno.situacao();
    }
}
