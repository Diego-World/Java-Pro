package Excecao.PersonalizadaA;
@SuppressWarnings("serial")
public class NumeroForaIntervalo extends RuntimeException{
    private String nomeDoAtribudo;
    NumeroForaIntervalo(String nomeDoAtributo){
        this.nomeDoAtribudo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O Atributo %s está negativo", nomeDoAtribudo);
    }
}
