package introducao;

public class Carro {
    public String modelo;
    public String cor;
    public int ano;

    public Carro(String modelo, String cor, int ano){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public int acelerar() {
        System.out.println("O carro " + modelo + " está acelerando!");
        return 0;
    }
}
