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

    public int getHoras() { return this.horas; }
    public int getMinutos() { return this.minutos; }

    public void adicionar(int minutos) {
        int total = this.horas * 60 + this.minutos + minutos;
        this.horas = (total / 60) % 24;
        this.minutos = total % 60;
    }

    public void adicionar(int horas, int minutos) {
        adicionar(horas * 60 + minutos);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.horas, this.minutos);
    }

    public static void main(String[] args) {
        Horario aula = new Horario(7, 30);
        System.out.println("Inicio: " + aula);

        aula.adicionar(50);
        System.out.println("+ 50 min: " + aula);

        aula.adicionar(1, 45);
        System.out.println("+ 1h45: " + aula);

        Horario noite = new Horario(23, 50);
        noite.adicionar(20);
        System.out.println("23:50 + 20 min: " + noite);
    }
}
