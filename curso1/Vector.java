import java.util.List;

public class Vector {
    public static void main(String[] args) {
        List<String> esporte = new java.util.Vector<>();

        //adicionar 4 esporte no vetor

        esporte.add("Futebol");
        esporte.add("Basquetebol");
        esporte.add("Tenis de mesa");
        esporte.add("Handebol");

        esporte.set(2,"Ping Pong");
        esporte.remove(2);
        esporte.remove("Handebol");

        System.out.println(esporte.get(0));

        for (String esportes: esporte)
        {
            System.out.println(esportes);
        }
    }
}
