package banda;

public class Instrumento {
    private String nome;

    public Instrumento(String nome) {
        this.nome = nome;
    }

    public String getNome() { return this.nome; }

    public String getFamilia() {
        return "outros";
    }

    public void tocar() {
        System.out.println(this.nome + ": som de instrumento");
    }
}
