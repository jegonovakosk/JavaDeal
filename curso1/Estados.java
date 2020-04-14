import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.TreeMap;

public class Estados {
    public static void main(String[] args) {
        TreeMap<String, String> estados = new TreeMap<>();

        estados.put("Parana","PR");
        estados.put("Santa Catarina", "SC");
        estados.put("Rio Grande do Sul", "RS");
        estados.put("São Paulo", "SP");
        estados.put("Rio de Janeiro","RJ");
        estados.put("Bahia","BH");
        estados.put("Minas Gerais","MG");

        System.out.println(estados);

        System.out.println(estados.firstKey());
        System.out.println(estados.lastKey());
        System.out.println(estados.lowerKey("Parana"));
        System.out.println(estados.higherKey("Parana"));

       Map.Entry<String, String> firstEntry = estados.pollFirstEntry();
       Map.Entry<String, String> lastEntry = estados.pollLastEntry();

        System.out.println(estados);

        estados.put("Distrito Federal","DF");
        System.out.println(estados);

        for (Map.Entry<String, String> capital: estados.entrySet()
             ) {
            System.out.println(capital.getKey() + "-----"+ capital.getValue());
        }
    }
}
