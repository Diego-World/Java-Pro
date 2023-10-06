package Oop.Herança.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    private int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public String velocimetro(){
        String velocidade = String.valueOf(velocidadeAtual);
        return "A velocidade atual do veículo " + this.getClass().toString() + " é: " + velocidade;
    }

    public void acelerar(){
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += getDelta();
        }
    }

    public void freiar(){
        if(velocidadeAtual >= 5 ){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
