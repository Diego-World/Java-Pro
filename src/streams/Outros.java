package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Diego",10.0);
        Aluno a2 = new Aluno("Diana",8.0);
        Aluno a3 = new Aluno("Pietro",7.5);
        Aluno a4 = new Aluno("Gustavo",9.4);
        Aluno a5 = new Aluno("Abner",6.9);
        Aluno a6 = new Aluno("Nicolle",4.3);
        Aluno a7 = new Aluno("Doralicce",2.0);
        Aluno a8 = new Aluno("Rebeca",3.5);
        Aluno a15 = new Aluno("Gean",10.0);
        Aluno a95 = new Aluno("Cléo",10.0);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a15,a95);

        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nTake While");
        alunos.stream()
                .distinct()
                .takeWhile(aluno -> aluno.nota >= 7)
                .forEach(System.out::println);


        System.out.println("\nSimple filter");
        alunos.stream().filter(aluno -> aluno.nota >= 7).forEach(System.out::println);

    }
}
