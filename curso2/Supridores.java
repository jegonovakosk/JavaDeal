package curso2;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciarPessoa = () -> new Pessoa();
        System.out.println(instanciarPessoa.get());
    }
}
 class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(){
        nome = "Jego";
        idade = 29;
    }

     @Override
     public String toString() {
         return String.format("Nome - %s, Idade - %d",nome,idade);
     }
 }