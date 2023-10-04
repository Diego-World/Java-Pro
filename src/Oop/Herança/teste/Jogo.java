package Oop.Herança.teste;

import Oop.Herança.Heroi;
import Oop.Herança.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi = new Heroi(10,10);

        Monstro monstro = new Monstro(10,11);


        System.out.println(heroi.vida);
        System.out.println(monstro.vida);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        System.out.println("Heroi tem => " + heroi.vida);
        System.out.println("O monstro tem => " + monstro.vida);

    }

}
