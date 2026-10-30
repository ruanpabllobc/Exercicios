package banco;

import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        Conta ana = new Conta("Ana", 500.0);
        Conta bruno = new ContaCorrente("Bruno", 300.0, 500.0);
        Conta carla = new Conta("Carla", 1000.0);
        Conta davi = new ContaCorrente("Davi", 100.0, 200.0);
        contas.add(ana);
        contas.add(bruno);
        contas.add(carla);
        contas.add(davi);

        for (Conta c : contas) {
            System.out.println(c);
        }

        System.out.println();
        System.out.println("Sacando R$ 600.0 de cada conta...");
        for (Conta c : contas) {
            if (c.sacar(600.0)) {
                System.out.println(c.getTitular() + ": saque realizado");
            } else {
                System.out.println(c.getTitular() + ": saque negado");
            }
        }

        System.out.println();
        System.out.print("Carla transfere R$ 200.0 para Davi: ");
        if (carla.transferir(davi, 200.0)) {
            System.out.println("realizada");
        } else {
            System.out.println("negada");
        }

        System.out.print("Davi transfere R$ 450.0 para Ana: ");
        if (davi.transferir(ana, 450.0)) {
            System.out.println("realizada");
        } else {
            System.out.println("negada");
        }

        System.out.print("Ana transfere R$ 2000.0 para Bruno: ");
        if (ana.transferir(bruno, 2000.0)) {
            System.out.println("realizada");
        } else {
            System.out.println("negada");
        }

        System.out.println();
        for (Conta c : contas) {
            System.out.println(c);
        }
    }
}
