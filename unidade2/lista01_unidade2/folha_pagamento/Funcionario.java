package folha_pagamento;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() { return nome; }
    public double getSalarioBase() { return salarioBase; }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return nome + ": R$ " + calcularSalario();
    }
}
