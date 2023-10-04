package Oop.Encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(new Idade(-20));
        p1.setIdade(new Idade(30));
        System.out.println(p1.getIdade().anos);
        System.out.println(p1.getIdade().getAnosEmMeses());
    }
}
