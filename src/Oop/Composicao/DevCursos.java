package Oop.Composicao;

public class DevCursos {
    public static void main(String[] args) {
        Aluno aluno1 =new Aluno("Diego");
        Aluno aluno2 =new Aluno("Diana");
        Aluno aluno3 =new Aluno("Pietro");

        Curso curso1 = new Curso("JavaProfissional");
        Curso curso2 = new Curso("React Native Master");
        Curso curso3 = new Curso("Estrutura de dados Alfa");
        Curso curso4 = new Curso("C# descomplicado");
        Curso curso5 = new Curso("SQL Premium");

        curso1.adicionarAluno(aluno2);
        curso1.adicionarAluno(aluno3);

        curso2.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno1);

        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);

        aluno2.adicionarCurso(curso4);
        aluno3.adicionarCurso(curso5);
        aluno1.adicionarCurso(curso5);

        for (Aluno aluno:curso5.alunos) {
            System.out.println("Estou matriculado no curso 1...");
            System.out.println("Meu nome é "+aluno.nome);
            System.out.println();
        }
        System.out.println(aluno1.cursos.get(0).alunos);
        Curso cursoEncontrado = aluno2.obterCursoPorNome("JavaProfissional");

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
