package Oop.Herança.desafio;

public class Carro {
    int velocidadeAtual;

    public String velocimetro(){
        String velocidade = String.valueOf(velocidadeAtual);
        return "A velocidade atual do veículo " + this.getClass().toString() + " é: " + velocidade;
    }

    public void acelerar(){
        velocidadeAtual += 5;
    }

    public void freiar(){
        if(velocidadeAtual>=0){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }
    }
}
