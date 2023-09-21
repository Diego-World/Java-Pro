package Oop.Herança;

public class Jogador {
    int x;
    int y;

    boolean andar(Direcao direcao){
        if(x < 0 || y < 0){
        switch (direcao){
            case NORTE:
                y--;
            break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
            }
        }
        return true;
    }
}
