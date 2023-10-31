package Exercicios;

public class Exercicio03 {

    /* Desenvolva um programa que imprima os primeiros 20 números da sequência de Fibonacci em Java. */

    public static void main(String[] args) {

        int anterior = 0;
        int atual = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.println(anterior);
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

    }
}
