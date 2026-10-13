package veiculos;

public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Argo", 2022, 4);
        Moto moto = new Moto("Honda", "CG 160", 2023, 160);
        System.out.println(carro);
        System.out.println(moto);
    }
}
