package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Diana", "Diego","Zenitsu","Abe");

        for(int i = 0; i < aprovados.size();i++){
            System.out.println(aprovados.get(i) + " For");
        }

        System.out.println();

        for (String nome:aprovados) {
            System.out.println(nome+ " ForEach");
        }

        System.out.println("\nUsando o Iterator");

        Iterator<String> iterator = aprovados.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " Com o Iterator");
        }

        System.out.println("\nUsando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

        System.out.println("\nUsando Stream paralel");
        Stream<String> stream1 = aprovados.parallelStream();
        stream1.forEach(System.out::println);



    }
}
