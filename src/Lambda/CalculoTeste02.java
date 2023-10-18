package Lambda;

public class CalculoTeste02 {
    public static void main(String[] args) {

        Calculo calculo = (x,y) -> {
            return x+y;
        };

        System.out.println(calculo.executar(2.0,3));
        calculo = (x,y) -> x*y;

        System.out.println(calculo.executar(2.0,3));

        System.out.println(calculo.legal());
        System.out.println(Calculo.muitoLegal());
    }
}