package banda;

public class Banda {
    private String nome;
    private Instrumento[] instrumentos;

    public Banda(String nome, Instrumento[] instrumentos) {
        this.nome = nome;
        this.instrumentos = instrumentos;
    }

    public String getNome() { return nome; }

    public void apresentar() {
        System.out.println("Banda " + nome + " tocando:");
        for (int i = 0; i < instrumentos.length; i++) {
            instrumentos[i].tocar();
        }
    }

    public void solo(int posicao) {
        if (posicao < 0 || posicao >= instrumentos.length) {
            System.out.println("Posição inválida: " + posicao);
        } else {
            System.out.print("Solo! ");
            instrumentos[posicao].tocar();
        }
    }

    public int contarPorFamilia(String familia) {
        int quantidade = 0;
        for (int i = 0; i < instrumentos.length; i++) {
            if (instrumentos[i].getFamilia().equals(familia)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static void main(String[] args) {
        Instrumento[] instrumentos = {
            new Violao("Violão"),
            new Bateria("Bateria"),
            new Flauta("Flauta"),
            new Violao("Guitarra")
        };
        Banda banda = new Banda("Os Objetos", instrumentos);
        banda.apresentar();
        System.out.println("Instrumentos de cordas: " + banda.contarPorFamilia("cordas"));
        System.out.println("Instrumentos de sopro: " + banda.contarPorFamilia("sopro"));

        System.out.println();
        banda.solo(1);
        banda.solo(5);
    }
}
