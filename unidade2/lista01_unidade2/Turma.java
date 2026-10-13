public class Turma {
    private String nomeDisciplina;
    private double[] notas;

    public Turma(String nomeDisciplina, double[] notas) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = notas;
    }

    public String getNomeDisciplina() { return nomeDisciplina; }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public int contarAprovados() {
        int aprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public static void main(String[] args) {
        double[] notas = {7.0, 5.5, 9.0, 6.0, 8.5};
        Turma t = new Turma("POO", notas);
        System.out.println("Disciplina: " + t.getNomeDisciplina());
        System.out.println("Média da turma: " + t.calcularMedia());
        System.out.println("Aprovados: " + t.contarAprovados());
    }
}
