package Exercicios;

import java.util.Scanner;

public class Exercicio04 {

    /* Faça um programa Java que determine o fatorial de um número inteiro não negativo. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número não negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número deve ser não negativo.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
