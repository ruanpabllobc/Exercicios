package veiculos;

public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Argo", 2022, 80000.0, 4);
        Carro carroAntigo = new Carro("VW", "Gol", 2001, 12000.0, 2);
        Moto moto = new Moto("Honda", "CG 160", 2023, 15000.0, 160);
        Moto motoGrande = new Moto("Yamaha", "MT-07", 2021, 50000.0, 689);
        Moto motoAntiga = new Moto("Honda", "CG 125", 2003, 6000.0, 125);

        System.out.println(carro);
        System.out.println("IPVA: R$ " + carro.calcularIPVA());
        System.out.println(carroAntigo);
        System.out.println("IPVA: R$ " + carroAntigo.calcularIPVA());
        System.out.println(moto);
        System.out.println("IPVA: R$ " + moto.calcularIPVA());
        System.out.println(motoGrande);
        System.out.println("IPVA: R$ " + motoGrande.calcularIPVA());
        System.out.println(motoAntiga);
        System.out.println("IPVA: R$ " + motoAntiga.calcularIPVA());
    }
}
