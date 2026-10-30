package banda;

public class Bateria extends Instrumento {

    public Bateria(String nome) {
        super(nome);
    }

    @Override
    public String getFamilia() {
        return "percussao";
    }

    @Override
    public void tocar() {
        System.out.println(getNome() + ": tum tum ta!");
    }
}
