package Lambda;

public class CalculoTeste02 {
    public static void main(String[] args) {
        Calculo soma = (x,y) -> {
            return x+y;
        };

        System.out.println(soma.executar(2.0,3));
        soma = (x,y) -> x*y;

        System.out.println(soma.executar(2.0,3));

        System.out.println(soma.legal());
        System.out.println(Calculo.muitoLegal());
    }
}