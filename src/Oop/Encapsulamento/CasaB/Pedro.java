package Oop.Encapsulamento.CasaB;

import Oop.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana{
    void testeAcessos(){
        Ana mae = new Ana();
        System.out.println(formaDeFalar); // somente via herança e não por instancia
//        System.out.println(mae.facoDentroDeCasa);
        System.out.println(mae.todoMundoSabe);
//        System.out.println(mae.segredo);
    }
}
