package Oop.Herança.desafio;

public interface Luxo {
    void ligarAr();
    void desligarAr();

    default int velocidadeDoAr(){
     return 1;
    }
}
