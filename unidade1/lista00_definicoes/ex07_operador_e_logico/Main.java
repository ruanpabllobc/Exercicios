package ex07_operador_e_logico;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Media: ");
        double media = sc.nextDouble();

        System.out.print("Frequencia: ");
        double frequencia = sc.nextDouble();

        boolean notaOk = (media >= 6.0);
        boolean frequenciaOk = (frequencia >= 75);

        // "&&" so e verdadeiro quando as DUAS condicoes sao verdadeiras
        if (notaOk && frequenciaOk) {
            System.out.println("Situacao: Aprovado");
        } else if (!notaOk && frequenciaOk) {
            System.out.println("Situacao: Reprovado por Nota");
        } else if (notaOk && !frequenciaOk) {
            System.out.println("Situacao: Reprovado por Falta");
        } else {
            // aqui os dois criterios falharam
            System.out.println("Situacao: Reprovado por Nota e Falta");
        }

        sc.close();
    }
}
