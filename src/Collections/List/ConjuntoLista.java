package Collections.List;

import java.util.ArrayList;

public class ConjuntoLista {
    public static void main(String[] args) {
        ArrayList<Usuario> usu = new ArrayList<>();

       Usuario u1 = new Usuario("Doralice");
       usu.add(u1);
       usu.add(new Usuario("Diego"));
       usu.add(new Usuario("Diana"));
       usu.add(new Usuario("Pietro"));

        for (Usuario u:usu) {
            System.out.println(u.nome);
        }
        // Printando através do ToString
        System.out.println(u1);
        // Acesso pelo indíce
        System.out.println(usu.get(2));

        // Removendo através do objeto, é aqui que o equals e hashCode entra em ação, usando o nome do Usuario como parâmetro.
        // Retornar um Boolean
        usu.remove(new Usuario("Pietro"));
        System.out.println(usu.remove(new Usuario("Pietro")));
        System.out.println(usu.contains(new Usuario("Pietro")));

        for (Usuario u:usu) {
            System.out.println(u.nome);
        }
        // Removendo pelo indíce
        System.out.println(usu.remove(0));
        System.out.println(usu.contains("Doralice"));

        for (Usuario u:usu) {
            System.out.println(u.nome);
        }

    }
}
