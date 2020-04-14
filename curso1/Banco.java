import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Banco {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clieneAtendido = filaBanco.poll();

        System.out.println("Cliente em Atendimento --  " + clieneAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);


        //filaBanco.clear();
        String erro = filaBanco.element();
        System.out.println(erro);

        for (String cliente: filaBanco
             ) {
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("---->" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.isEmpty() + " Nao esta Vazio ");

        System.out.println(filaBanco.size()  + " Elementos ");

        System.out.println(filaBanco.contains(" Juliana "));

        //filaBanco.clear();
        //System.out.println(filaBanco.isEmpty());

    }
}
