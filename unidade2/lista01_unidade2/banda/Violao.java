package banda;

public class Violao extends Instrumento {

    public Violao(String nome) {
        super(nome);
    }

    @Override
    public String getFamilia() {
        return "cordas";
    }

    @Override
    public void tocar() {
        System.out.println(getNome() + ": plim plim plim");
    }
}
