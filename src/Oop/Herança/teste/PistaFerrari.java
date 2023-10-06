package Oop.Herança.teste;

import Oop.Herança.desafio.Carro;
import Oop.Herança.desafio.Ferrari;

public class PistaFerrari {
    public static void main(String[] args) {

        Ferrari ferrariBranca = new Ferrari();
        System.out.println(ferrariBranca.velocimetro());

        ferrariBranca.acelerar();
        System.out.println(ferrariBranca.velocimetro());

        ferrariBranca.ligarAr();
        ferrariBranca.acelerar();
        System.out.println(ferrariBranca.velocimetro());

        ferrariBranca.desligarAr();
        ferrariBranca.ligarTurbo();
        ferrariBranca.acelerar();
        System.out.println(ferrariBranca.velocimetro());

        ferrariBranca.freiar();
        ferrariBranca.freiar();
        ferrariBranca.freiar();
        ferrariBranca.freiar();
        System.out.println(ferrariBranca.velocimetro());
    }
}
