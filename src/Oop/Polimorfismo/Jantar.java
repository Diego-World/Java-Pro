package Oop.Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(64.00);

        Arroz comida1 = new Arroz(0.25);
        Feijão comida2 = new Feijão(0.1);
        Sorvete comida3 = new Sorvete(0.2);

        convidado.comer(comida1);
        convidado.comer(comida2);
        convidado.comer(comida3);

        System.out.println(convidado.getPeso());
    }
}
