package exercicio03;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        // Operadores relacionais (comparacao) -> sempre retornam boolean
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("---");

        // Operadores logicos -> combinam booleans
        boolean cond1 = (a > b);      // true
        boolean cond2 = (b > 10);     // false

        System.out.println("cond1 && cond2: " + (cond1 && cond2)); // false, precisa dos dois
        System.out.println("cond1 || cond2: " + (cond1 || cond2)); // true, basta um
        System.out.println("!cond1        : " + (!cond1));         // inverte
    }
}