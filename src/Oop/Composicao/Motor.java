package Oop.Composicao;

public class Motor {
    boolean ligado = false;
    double fatorInjecao = 1;

    // A aceleração aumenta o fator de injeção (gasolina)
    public int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
