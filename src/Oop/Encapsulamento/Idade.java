package Oop.Encapsulamento;

public class Idade {
    public int anos;

    public Idade(int anos) {
        if (idadePositivaValidacao(anos)) {
            this.anos = anos;
        } else {
            System.out.println("Idade deve ser positiva");
        }
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        if (idadePositivaValidacao(anos)) {
            this.anos = anos;
        } else {
            System.out.println("Idade deve ser positiva");
        }
    }

    private boolean idadePositivaValidacao(int anos) {
        return anos >= 0;
    }
}
