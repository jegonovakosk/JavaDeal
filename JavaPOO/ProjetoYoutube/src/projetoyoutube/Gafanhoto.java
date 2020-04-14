package projetoyoutube;
public class Gafanhoto extends Pessoa {
    private String login;
    private int topAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.topAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTopAssistido() {
        return topAssistido;
    }

    public void setTopAssistido(int topAssistido) {
        this.topAssistido = topAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", topAssistido=" + topAssistido + '}';
    }
    
    
}
