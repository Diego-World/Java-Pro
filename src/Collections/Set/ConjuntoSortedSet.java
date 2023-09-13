package Collections.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoSortedSet {
    public static void main(String[] args) {

        // Aceita ordernação baseado na ordem de inserção
        // A anotação no <> é chamado de "generics"
        SortedSet<String> propriedades = new TreeSet<>();
        propriedades.add("AP Bela vista");
        propriedades.add("AP Itaquera");
        propriedades.add("AP José Bonifácio");
        propriedades.add("AP Pinheiros");
        System.out.println(propriedades.size());
        propriedades.add("AP Pinheiros");
        System.out.println(propriedades.size());
        System.out.println(propriedades);
    }
}
