package Oop.Herança.desafio;

public class Ferrari extends Carro{

    Ferrari(){
        super(100);
    }

    public void acelerar(){
        if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += 15;
        }
    }

    public void freiar(){
        if(velocidadeAtual>=5){
            velocidadeAtual -= 15;
        }else{
            velocidadeAtual = 0;
        }
    }
}
