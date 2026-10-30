package banda;

public class Flauta extends Instrumento {

    public Flauta(String nome) {
        super(nome);
    }

    @Override
    public String getFamilia() {
        return "sopro";
    }

    @Override
    public void tocar() {
        System.out.println(getNome() + ": fiu fiu fiuuu");
    }
}
