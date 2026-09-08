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

    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "Azul", 1980);
        Carro carro2 = new Carro("Gol", "Prata", 2010);

        carro1.acelerar();
        carro2.acelerar();
    }
}
