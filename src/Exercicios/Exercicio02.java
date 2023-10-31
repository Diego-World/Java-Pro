package Exercicios;

import java.io.InputStream;
import java.util.Scanner;

public class Exercicio02 {

    /*  Crie um programa que determine se um número é primo ou não em Java. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        String resultado = num % 2 == 0 ? "Número par" : "Número Impar";
        System.out.println(resultado);

        sc.close();
    }
}
