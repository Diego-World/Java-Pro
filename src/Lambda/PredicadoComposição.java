package Lambda;

import java.util.function.Predicate;

public class PredicadoComposição {
    public static void main(String[] args) {

        Predicate<Integer> ispar =
                num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos =
                num -> num >= 100 && num <= 999;

        System.out.println(ispar
                .and(isTresDigitos)
                .test(22));

        System.out.println(ispar
                .or(isTresDigitos)
                .test(22));
    }
}
