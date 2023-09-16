package Oop.Composicao;

public class AutoBahn {
    public static void main(String[] args) {

        Carro mustang = new Carro();
        System.out.println(mustang.estaLigado());

        mustang.ligar();
        System.out.println(mustang.estaLigado());

        System.out.println(mustang.motor.giros());

        mustang.acelerar();
        mustang.acelerar();

        System.out.println(mustang.motor.giros());

        mustang.frear();
        mustang.frear();
        mustang.frear();
        mustang.frear();
        mustang.frear();

        //Pelo fato de não existir o encapsulamento é possível alterar os atributos da classe motor.
        mustang.motor.fatorInjecao = -15;

        System.out.println(mustang.motor.giros());
    }
}
