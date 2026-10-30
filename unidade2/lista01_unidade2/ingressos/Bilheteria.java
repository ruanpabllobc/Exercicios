package ingressos;

import java.util.ArrayList;

public class Bilheteria {
    public static void main(String[] args) {
        ArrayList<Ingresso> vendidos = new ArrayList<>();
        vendidos.add(new Inteira("Show de Rock", 80.0));
        vendidos.add(new MeiaEntrada("Show de Rock", 80.0));
        vendidos.add(new Vip("Show de Rock", 80.0, 50.0));
        vendidos.add(new MeiaEntrada("Show de Rock", 80.0));

        double total = 0;
        for (Ingresso i : vendidos) {
            System.out.println(i);
            total += i.calcularPreco();
        }
        System.out.println("Total arrecadado: R$ " + total);
    }
}
