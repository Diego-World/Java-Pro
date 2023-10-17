package Lambda;

@FunctionalInterface // Força a interface a ter somente um metódo, muito usado no contexto lambdas
public interface Calculo {
    double executar (Double a, double b);
    default String legal(){
        return "Legal";
    }

    static String muitoLegal(){
        return "Legalx2";
    }
}
