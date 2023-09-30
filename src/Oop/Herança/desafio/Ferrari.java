package Oop.Herança.desafio;

public class Ferrari extends Carro{

    public void acelerar(){
        velocidadeAtual += 15;
    }
    public void freiar(){
        if(velocidadeAtual>=5){
            velocidadeAtual -= 15;
        }else{
            velocidadeAtual = 0;
        }
    }
}
