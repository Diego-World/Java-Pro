package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        print.accept("Diego\n");

        Stream<String> langs = Stream.of("Java ", "JS ","Lua\n");
        langs.forEach(print);

        String[] maisLangs = {"Python "," Lisp "," Pearl "," Kotlin\n"};

        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);

        Arrays.stream(maisLangs,1,4).forEach(print);

        List<String> outrasLans = Arrays.asList("Go "," C "," C++ ");
        outrasLans.stream().forEach(print);
        outrasLans.parallelStream().forEach(print);

//        Stream.generate(() -> "A").forEach(print); // Geração infinita
//        Stream.iterate(0,n->n-1).forEach(println);
    }
}
