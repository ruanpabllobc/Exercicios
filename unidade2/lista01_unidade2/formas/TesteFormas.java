package formas;

public class TesteFormas {
    public static void main(String[] args) {
        Forma[] formas = {
            new Retangulo(4, 5),
            new Triangulo(6, 3),
            new Retangulo(2, 2.5)
        };

        double total = 0;
        for (int i = 0; i < formas.length; i++) {
            System.out.println(formas[i]);
            total += formas[i].calcularArea();
        }
        System.out.println("Área total: " + total);

        System.out.println();
        if (formas[1].ehMaiorQue(formas[2])) {
            System.out.println("O triângulo é maior que o retângulo 2 x 2.5");
        } else {
            System.out.println("O triângulo não é maior que o retângulo 2 x 2.5");
        }
    }
}
