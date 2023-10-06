package Oop.Herança.desafio;

public class Ferrari extends Carro implements Esportivo{

    public Ferrari(){
        super(100);
        delta = 15;
    }

    @Override
    public void ligarTurbo() {
        delta = 35;
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
    }
}
