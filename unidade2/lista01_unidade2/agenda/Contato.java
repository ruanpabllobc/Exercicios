package agenda;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() { return this.nome; }
    public String getTelefone() { return this.telefone; }

    @Override
    public String toString() {
        return this.nome + " - " + this.telefone;
    }
}
