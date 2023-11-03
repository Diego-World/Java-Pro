package Excecao.PersonalizadaB;
@SuppressWarnings("serial")
public class StringVaziaException extends Exception{
    private String nomeDoAtribudo;
    StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtribudo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O Atributo %s está vazio", nomeDoAtribudo);
    }
}
