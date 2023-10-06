package Oop.Herança.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    protected int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public String velocimetro(){
        String velocidade = String.valueOf(velocidadeAtual);
        return "A velocidade atual do veículo " + this.getClass().toString() + " é: " + velocidade;
    }

    public void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += delta;
        }
    }

    public void freiar(){
        if(velocidadeAtual >= 5 ){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }
    }
}
