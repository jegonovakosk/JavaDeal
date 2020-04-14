package curso2;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Funcoes {
    public static void main(String[] args) {

      //  Consumer<String> imprimaFrase = frase -> System.out.println(frase);
        // imprimaFrase.accept("Hello World");

        Consumer<String> imprimaFrase = System.out::println;
        imprimaFrase.accept("Hello Word");

        System.out.println("");
        Function<String,String> retornarNomeAoCotrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornarNomeAoCotrario.apply("Jego"));
        System.out.println("");

        Function<String,Integer> converterStringParaNumeroInteiro = string -> Integer.valueOf(string) *2;
        System.out.println(converterStringParaNumeroInteiro.apply("50"));
        System.out.println("");
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Jego"));


    }
}
