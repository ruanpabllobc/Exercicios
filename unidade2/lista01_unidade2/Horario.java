public class Horario {
    private int horas;
    private int minutos;

    public Horario(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public Horario(int horas) {
        this(horas, 0);
    }

    public int getHoras() { return horas; }
    public int getMinutos() { return minutos; }

    public void adicionar(int minutos) {
        int total = horas * 60 + this.minutos + minutos;
        horas = (total / 60) % 24;
        this.minutos = total % 60;
    }

    public void adicionar(int horas, int minutos) {
        adicionar(horas * 60 + minutos);
    }

    public void adicionar(Horario outro) {
        adicionar(outro.getHoras(), outro.getMinutos());
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", horas, minutos);
    }

    public static void main(String[] args) {
        Horario aula = new Horario(7, 30);
        System.out.println("Início: " + aula);

        aula.adicionar(50);
        System.out.println("+ 50 min: " + aula);

        aula.adicionar(1, 45);
        System.out.println("+ 1h45: " + aula);

        Horario intervalo = new Horario(2);
        aula.adicionar(intervalo);
        System.out.println("+ " + intervalo + ": " + aula);

        Horario noite = new Horario(23, 50);
        noite.adicionar(20);
        System.out.println("23:50 + 20 min: " + noite);
    }
}
