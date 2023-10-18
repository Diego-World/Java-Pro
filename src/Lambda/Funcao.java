package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer,String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "ímpar";

        System.out.println(parOuImpar.apply(33));
        System.out.println(parOuImpar.apply(32)+"\n");

        Function<String,String> oResultadoE =
                valor -> "O Resultado é: " + valor;

        Function<String,String> empolgado =
                valor -> valor + "!!!" ;

        String resultadoFinal =
                parOuImpar
                        .andThen(oResultadoE)
                        .andThen(empolgado)
                        .apply(32);

        System.out.println(resultadoFinal);
    }
}
