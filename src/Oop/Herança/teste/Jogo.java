package Oop.Herança.teste;

import Oop.Herança.Heroi;
import Oop.Herança.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 10;

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 11;

        System.out.println(heroi.vida);
        System.out.println(monstro.vida);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        System.out.println("Heroi tem => " + heroi.vida);
        System.out.println("O monstro tem => " + monstro.vida);

    }

}
