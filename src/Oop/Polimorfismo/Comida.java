package Oop.Polimorfismo;

public abstract class Comida {
    protected double peso;

    public Comida(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
