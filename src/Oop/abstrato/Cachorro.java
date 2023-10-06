package Oop.abstrato;

public class Cachorro extends Mamifero{
    @Override
    public String mover() {
        return "Anda com as 4 patas";
    }

    @Override
    public String mamar() {
        return "amamenta até os 2 meses";
    }
}
