package folha_pagamento;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() { return this.nome; }
    public double getSalarioBase() { return this.salarioBase; }

    public double calcularSalario() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return this.nome + ": R$ " + calcularSalario();
    }
}
