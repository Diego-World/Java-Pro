package Lambda;

public class Multiplicar implements Calculo{
    @Override
    public double executar(Double a, double b) {
        return a*b;
    }
}
