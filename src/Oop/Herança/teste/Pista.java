package Oop.Herança.teste;

import Oop.Herança.desafio.Bmw;
import Oop.Herança.desafio.Carro;
import Oop.Herança.desafio.Ferrari;
import Oop.Herança.desafio.Mercedes;

import java.util.ArrayList;
import java.util.List;

public class Pista {
    public static void main(String[] args) {

        Ferrari f1 = new Ferrari();
        Bmw bmw1 = new Bmw();
        Mercedes mercedes = new Mercedes();

        List<Carro> carros = new ArrayList<>();
        carros.add(f1);
        carros.add(bmw1);
        carros.add(mercedes);

        for(int i = 0;i<1;i++){
            f1.acelerar();
        }
        for(int i = 0;i<15;i++){
            bmw1.acelerar();
        }
        for(int i = 0;i<5;i++){
            mercedes.acelerar();
        }

        for (Carro carro:carros) {
            System.out.println(carro.velocimetro());
        }

        f1.ligarTurbo();
        f1.acelerar();
        f1.desligarTurbo();
//        for(int i = 0;i<20;i++){
//            f1.freiar();
//        }

        System.out.println(f1.velocimetro());

    }
}
