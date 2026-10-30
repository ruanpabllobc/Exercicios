package banda;

public class Instrumento {
    private String nome;

    public Instrumento(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public String getFamilia() {
        return "outros";
    }

    public void tocar() {
        System.out.println(nome + ": som de instrumento");
    }
}
