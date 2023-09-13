package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoHashSetOrganizado {
    public static void main(String[] args) {
        // Set homogêneo de String, definido no operador diamante "<>"
        Set<String> lista = new HashSet<>();
        lista.add("Diego");
        lista.add("Diego");
        lista.add("da");
        lista.add("Silva");
        lista.add("Gouveia");
        lista.add("Não ordenado XD");
        System.out.println(lista);

        for (String i:
             lista) {
            System.out.println(i);
        }



    }
}
