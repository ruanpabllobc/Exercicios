public class Turma {
    private String nomeDisciplina;
    private String[] nomes;
    private double[] notas;

    public Turma(String nomeDisciplina, String[] nomes, double[] notas) {
        this.nomeDisciplina = nomeDisciplina;
        this.nomes = nomes;
        this.notas = notas;
    }

    public String getNomeDisciplina() { return nomeDisciplina; }

    public void exibir() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7) {
                System.out.println(nomes[i] + ": " + notas[i] + " (aprovado)");
            } else {
                System.out.println(nomes[i] + ": " + notas[i] + " (reprovado)");
            }
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public int contarAcimaDaMedia() {
        double media = calcularMedia();
        int acima = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acima++;
            }
        }
        return acima;
    }

    public String melhorAluno() {
        int posicaoMaior = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notas[posicaoMaior]) {
                posicaoMaior = i;
            }
        }
        return nomes[posicaoMaior];
    }

    public void aplicarBonus(double ponto) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] += ponto;
            if (notas[i] > 10) {
                notas[i] = 10;
            }
        }
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla", "Davi", "Elisa"};
        double[] notas = {7.0, 5.5, 9.5, 6.0, 8.5};
        Turma t = new Turma("POO", nomes, notas);

        System.out.println("Disciplina: " + t.getNomeDisciplina());
        t.exibir();
        System.out.println("Média da turma: " + t.calcularMedia());
        System.out.println("Acima da média: " + t.contarAcimaDaMedia());
        System.out.println("Melhor aluno: " + t.melhorAluno());

        System.out.println();
        System.out.println("Aplicando 1.0 ponto de bônus...");
        t.aplicarBonus(1.0);
        t.exibir();
        System.out.println("Média da turma: " + t.calcularMedia());
    }
}
