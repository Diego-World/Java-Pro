package Oop.Encapsulamento;

public class Pessoa {
    private Idade idade;

    public Pessoa(Idade idade) {
        this.idade = idade;
    }

    public Idade getIdade() {
        return idade;
    }

    public void setIdade(Idade idade) {
        this.idade = idade;
    }
}