package Lambda.ForEach;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ForEachLambda {
    public static void main(String[] args) {
        List<String> livros =
                Arrays.asList("O homem mais rico da babilônia", "Deep Work", "The Dip", "Ritice");

        for (String livro : livros) {
            System.out.println(livro);
        }

        System.out.println("\nForEach Lambda 01");
        livros.forEach(nome -> System.out.println(nome));

        System.out.println("\nForEach Lambda 02 - Method Reference");
        livros.forEach(System.out::println);

        System.out.println("\nForEach Lambda 03");
        livros.forEach(nome -> imprimirNome(nome));

        System.out.println("\nForEach Lambda 04 - Method Reference");
        livros.forEach(ForEachLambda::imprimirNome);

    }

    static void imprimirNome(String nome){
        System.out.println(nome + "!!!");
    }
}
