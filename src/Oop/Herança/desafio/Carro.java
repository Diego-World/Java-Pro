package Oop.Herança.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;

    public Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public String velocimetro(){
        String velocidade = String.valueOf(velocidadeAtual);
        return "A velocidade atual do veículo " + this.getClass().toString() + " é: " + velocidade;
    }

    public void acelerar(){
        if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += 5;
        }
    }

    public void freiar(){
        if(velocidadeAtual>=0){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }
    }
}
