package Collections.Set;

import Collections.List.Usuario;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Diego"));
        usuarios.add(new Usuario("Diana"));
        usuarios.add(new Usuario("Pietro"));
        usuarios.add(new Usuario("Gean"));

        boolean resultado = usuarios.contains(new Usuario("Diego"));
        System.out.println(resultado);
    }
}
