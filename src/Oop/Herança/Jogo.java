package Oop.Herança;

public class Jogo {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.andar(Direcao.NORTE);
        jogador1.andar(Direcao.NORTE);
        jogador1.andar(Direcao.NORTE);
        System.out.println(jogador1.y);
    }

}
