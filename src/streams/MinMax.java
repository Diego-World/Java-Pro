package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Diego",10.0);
        Aluno a2 = new Aluno("Diana",8.0);
        Aluno a3 = new Aluno("Pietro",7.5);
        Aluno a4 = new Aluno("Gustavo",9.4);
        Aluno a5 = new Aluno("Abner",6.9);
        Aluno a6 = new Aluno("Nicolle",4.3);
        Aluno a7 = new Aluno("Doralicce",2.0);
        Aluno a8 = new Aluno("Rebeca",3.5);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        Comparator<Aluno> menorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return -1;
            if(aluno1.nota < aluno2.nota) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(menorNota).get());

        System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().max(menorNota).get());

    }
}
