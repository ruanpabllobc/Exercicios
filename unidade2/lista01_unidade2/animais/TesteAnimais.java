package animais;

public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Rex", 3);
        Gato g = new Gato("Mimi", 2);
        Peixe p = new Peixe("Nemo", 2);

        System.out.println(c);
        c.emitirSom();

        System.out.println(g);
        g.emitirSom();

        System.out.println(p);
        p.emitirSom();
    }
}
