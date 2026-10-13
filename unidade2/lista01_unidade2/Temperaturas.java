public class Temperaturas {
    private String cidade;
    private double[] valores;

    public Temperaturas(String cidade, double[] valores) {
        this.cidade = cidade;
        this.valores = valores;
    }

    public String getCidade() { return cidade; }

    public double maiorTemperatura() {
        double maior = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }
        return maior;
    }

    public double menorTemperatura() {
        double menor = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        double[] semana = {28.0, 24.5, 33.0, 31.5, 29.0, 30.5, 26.0};
        Temperaturas t = new Temperaturas("Natal", semana);
        System.out.println("Cidade: " + t.getCidade());
        System.out.println("Maior temperatura: " + t.maiorTemperatura());
        System.out.println("Menor temperatura: " + t.menorTemperatura());
    }
}
