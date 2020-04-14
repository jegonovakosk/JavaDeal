import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        List<String> nome = new ArrayList<>();

        nome.add("Jego");
        nome.add("sarah");
        nome.add("Aline");
        nome.add("Maria");
        nome.add("Heloisa");

        System.out.println(nome);
        nome.set(1,"Sophia");
        Collections.sort(nome);

        System.out.println(nome);
       nome.remove(4);
        System.out.println(nome);
        nome.remove("Maria");
        System.out.println(nome);

        String nomes = nome.get(2);
        System.out.println(nomes);

        int posicao = nome.indexOf("Jego");
        System.out.println("Jego esta na Posição - " + posicao);

        int tamanho = nome.size();
        System.out.println("Tamanho da list - " + tamanho);

        for (String nomeDoItem: nome) {
        System.out.println(nomeDoItem);
        }

        Iterator<String> iterator = nome.iterator();

        while (iterator.hasNext());{
            System.out.println("----->" + iterator.next());
        }


    }
}
