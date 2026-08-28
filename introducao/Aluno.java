package introducao;

public class Aluno {
    public String nome;
    public int idade;
    public String curso;
    public String matricula;

    public Aluno(String nome, int idade, String curso, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
    }

    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public void dirigir(Carro carro) {
        System.out.println(nome + " está dirigindo o carro " + carro.modelo);
    }
}
