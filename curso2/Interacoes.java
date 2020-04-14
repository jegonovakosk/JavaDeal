package curso2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    public static void main(String[] args) {
        String [] nomes = {"Joao","Jose","Maria","Joana","Edite","Joao"};
        Integer[] numeros = {1,2,3,4,5,6,7,8,9,};
        //imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
    }
    public static void imprimirNomesFiltrados (String... nomes){
        String nomesParaImprimir = "";
        for (int i = 0 ; i < nomes.length ; i++){
            if (nomes[i].equals("Joao")){
                nomesParaImprimir+=" "+nomes[i];
            }
        }
        System.out.println("Nomes do For =" + nomesParaImprimir);

        String  nomesStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Joao"))
                .collect(Collectors.joining());
        System.out.println("Nome da Stream = " + nomesStream);

    }

    public static void imprimirTodosNomes(String... nomes){
        for (String nome : nomes) {
            System.out.println("Imprimido pelo for -- " + nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo ForEach --- " + nome));
    }

}
