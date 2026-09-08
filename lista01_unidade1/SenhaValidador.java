package lista01_unidade1;

public class SenhaValidador {
    private String senha;

    public SenhaValidador(String senha) {
        this.senha = senha;
    }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public boolean isSenhaForte() {
        if (getSenha().length() < 8) {
            return false;
        }
        boolean temNumero = false;
        boolean temMaiuscula = false;

        for (int i = 0; i < getSenha().length(); i++) {
            char c = getSenha().charAt(i);
            if (Character.isDigit(c)) {
                temNumero = true;
            }
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }
        }
        return temNumero && temMaiuscula;
    }

    public static void main(String[] args) {
        SenhaValidador sv = new SenhaValidador("Senha123");
        System.out.println(sv.isSenhaForte());
    }
}