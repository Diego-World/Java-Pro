package Oop.Herança;

public class Jogador {
    public int x;
    public int y;
    public int vida = 100;

    protected Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }

     public boolean atacar(Jogador oponente){

         int deltaX = Math.abs(x - oponente.x);
         int deltaY = Math.abs(y - oponente.y);

         if(deltaX == 0 && deltaY == 1){
          oponente.vida -= 10;
         }else if(deltaX == 1 && deltaY == 0){
             oponente.vida -= 10;
         }else{
             return false;
         }
        return true;
    }

    public boolean andar(Direcao direcao){
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
