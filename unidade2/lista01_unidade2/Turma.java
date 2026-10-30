public class Turma {
    private String nomeDisciplina;
    private String[] nomes;
    private double[] notasFinais;

    public Turma(String nomeDisciplina, String[] nomes, double[] notasFinais) {
        this.nomeDisciplina = nomeDisciplina;
        this.nomes = nomes;
        this.notasFinais = notasFinais;
    }

    public String getNomeDisciplina() { return this.nomeDisciplina; }

    public void exibir() {
        for (int i = 0; i < this.notasFinais.length; i++) {
            if (this.notasFinais[i] >= 7) {
                System.out.println(this.nomes[i] + ": " + this.notasFinais[i] + " (aprovado)");
            } else {
                System.out.println(this.nomes[i] + ": " + this.notasFinais[i] + " (reprovado)");
            }
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < this.notasFinais.length; i++) {
            soma += this.notasFinais[i];
        }
        return soma / this.notasFinais.length;
    }

    public int contarAcimaDaMedia() {
        double media = calcularMedia();
        int acima = 0;
        for (int i = 0; i < this.notasFinais.length; i++) {
            if (this.notasFinais[i] > media) {
                acima++;
            }
        }
        return acima;
    }

    public String melhorAluno() {
        int posicaoMaior = 0;
        for (int i = 1; i < this.notasFinais.length; i++) {
            if (this.notasFinais[i] > this.notasFinais[posicaoMaior]) {
                posicaoMaior = i;
            }
        }
        return this.nomes[posicaoMaior];
    }

    public void aplicarBonus(double ponto) {
        for (int i = 0; i < this.notasFinais.length; i++) {
            this.notasFinais[i] += ponto;
            if (this.notasFinais[i] > 10) {
                this.notasFinais[i] = 10;
            }
        }
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla", "Davi", "Elisa"};
        double[] notasFinais = {7.0, 5.5, 9.5, 6.0, 8.5};
        Turma t = new Turma("POO", nomes, notasFinais);

        System.out.println("Disciplina: " + t.getNomeDisciplina());
        t.exibir();
        System.out.println("Media da turma: " + t.calcularMedia());
        System.out.println("Acima da media: " + t.contarAcimaDaMedia());
        System.out.println("Melhor aluno: " + t.melhorAluno());

        System.out.println();
        System.out.println("Aplicando 1.0 ponto de bonus...");
        t.aplicarBonus(1.0);
        t.exibir();
        System.out.println("Media da turma: " + t.calcularMedia());
    }
}
