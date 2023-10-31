package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Exercicio01 {

    /* Escreva um programa Java para calcular a média de uma lista de números inteiros. */

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(45,84,12,321,54,78,9,4,5,61,3,4,86,45);
        BinaryOperator<Integer> soma = (start,next)-> start+next;

        Integer x = nums.stream().reduce(soma).get();

        Double media = (double) (x / nums.size());
        System.out.printf(String.valueOf(media));
    }
}
