package agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato c) {
        if (buscarPorNome(c.getNome()) != null) {
            System.out.println(c.getNome() + " já está na agenda");
        } else {
            contatos.add(c);
        }
    }

    public void listarContatos() {
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }

    public Contato buscarPorNome(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equals(nome)) {
                return c;
            }
        }
        return null;
    }

    public void removerContato(String nome) {
        Contato c = buscarPorNome(nome);
        if (c != null) {
            contatos.remove(c);
            System.out.println(nome + " removido(a) da agenda");
        } else {
            System.out.println(nome + " não está na agenda");
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato(new Contato("Ana", "(84) 99999-1111"));
        agenda.adicionarContato(new Contato("Bruno", "(84) 98888-2222"));
        agenda.adicionarContato(new Contato("Carla", "(84) 97777-3333"));
        agenda.adicionarContato(new Contato("Ana", "(84) 96666-4444"));
        agenda.listarContatos();

        System.out.println();
        agenda.removerContato("Bruno");
        agenda.removerContato("Daniel");
        agenda.listarContatos();
    }
}
