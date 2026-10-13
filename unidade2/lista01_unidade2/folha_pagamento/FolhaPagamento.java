package folha_pagamento;

import java.util.ArrayList;

public class FolhaPagamento {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Ana", 3000.0));
        funcionarios.add(new Funcionario("Bruno", 2500.0));
        funcionarios.add(new Gerente("Carla", 5000.0, 2000.0));

        double total = 0;
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            total += f.calcularSalario();
        }
        System.out.println("Total da folha: R$ " + total);
    }
}
