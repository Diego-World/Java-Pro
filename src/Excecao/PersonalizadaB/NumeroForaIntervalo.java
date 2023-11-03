package Excecao.PersonalizadaB;
@SuppressWarnings("serial")
public class NumeroForaIntervalo extends Exception{
    private String nomeDoAtribudo;
    NumeroForaIntervalo(String nomeDoAtributo){
        this.nomeDoAtribudo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O Atributo %s está negativo", nomeDoAtribudo);
    }
}
