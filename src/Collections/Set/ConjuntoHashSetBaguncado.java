package Collections.Set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoHashSetBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        // Diversos tipos adicionados no mesmo conjunto
        conjunto.add("String");
        conjunto.add(12); // int -> Integer
        conjunto.add(96.23); // double -> Double
        conjunto.add(BigDecimal.valueOf(1534));
        conjunto.add('d');
        conjunto.add(true);
        // percorrendo conjunto usando o for each
        for (Object i:conjunto) {
            System.out.println(i);
        }
        System.out.println(conjunto);
        System.out.println("\n");
        System.out.println(conjunto.size());
        System.out.println("\n");
        // Adicionando elemento repetido, não vai alterar o tamanho da lista
        conjunto.add(true);
        System.out.println(conjunto.size());
        System.out.println(conjunto.remove(true));
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains(true));

        //Outra forma de iniciar a coleção
        Set numeros = new HashSet();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //União dos conjuntos
        conjunto.addAll(numeros); // Retorna um boolean
        System.out.println(conjunto);
        numeros.addAll(conjunto); // Retorna um boolean
        System.out.println(numeros);



    }
}
