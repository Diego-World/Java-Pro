package Lambda;

public class Somar implements Calculo{
    @Override
    public double executar(Double a, double b) {
        return a+b;
    }
}
