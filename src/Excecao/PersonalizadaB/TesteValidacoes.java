package Excecao.PersonalizadaB;

public class TesteValidacoes {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Diego",10);
            Validar.aluno(aluno);
        } catch (StringVaziaException | NumeroForaIntervalo e) {
            System.out.println(e.getMessage());
        }


        try {
            Validar.aluno(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervalo e) {
            throw new RuntimeException(e);
        } catch (StringVaziaException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fim :)");
    }
}
