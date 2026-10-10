package introducao;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "Azul", 1980);
        Carro carro2 = new Carro("Gol", "Prata", 2010);
        Aluno aluno1 = new Aluno("João", 20, "Engenharia");

        carro1.acelerar();
        carro2.acelerar();
        aluno1.dirigir(carro1);

    }
}