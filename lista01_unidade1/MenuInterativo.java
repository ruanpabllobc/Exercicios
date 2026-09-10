import java.util.Scanner;

public class MenuInterativo {
    private double numero1;
    private double numero2;

    public double getNumero1() { return numero1; }
    public void setNumero1(double numero1) { this.numero1 = numero1; }
    public double getNumero2() { return numero2; }
    public void setNumero2(double numero2) { this.numero2 = numero2; }

    public double somar() { return getNumero1() + getNumero2(); }
    public double subtrair() { return getNumero1() - getNumero2(); }
    public double multiplicar() { return getNumero1() * getNumero2(); }
    public double dividir() {
        if (getNumero2() == 0) {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
        return getNumero1() / getNumero2();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuInterativo calc = new MenuInterativo();
        int opcao;

        do {
            System.out.println("\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                calc.setNumero1(sc.nextDouble());
                System.out.print("Digite o segundo número: ");
                calc.setNumero2(sc.nextDouble());

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + calc.somar());
                        break;
                    case 2:
                        System.out.println("Resultado: " + calc.subtrair());
                        break;
                    case 3:
                        System.out.println("Resultado: " + calc.multiplicar());
                        break;
                    case 4:
                        System.out.println("Resultado: " + calc.dividir());
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
