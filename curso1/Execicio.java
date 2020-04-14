import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Execicio {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larrisa");
        nomes.add("Joao");

        System.out.println(nomes);

        nomes.set(2,"Roberto");

        System.out.println(nomes);
        nomes.remove(1);
        nomes.remove("Joao");
        System.out.println(nomes);
       int nome =  nomes.size();
        System.out.println(nome);

        boolean cont = nomes.contains("Juliana");
        System.out.println(cont);

        List<String> lista = new ArrayList<>(nomes);
        lista.add("Ismael");
        lista.add("Rodrigo");
        System.out.println(lista);

        Collections.sort(lista);

        cont = lista.isEmpty();
        System.out.println(cont);




    }
}
