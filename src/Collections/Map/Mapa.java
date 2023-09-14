package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1,"Java");
        usuarios.put(2,"Spri");
        usuarios.put(3,"Quarkus");
        usuarios.put(4,"API");
        usuarios.put(5,"REST");
        usuarios.put(2,"Spring Framework");
        usuarios.put(6,"SQL");

        // o metódo para adicionar os elemento se chama .put e não .add, devido ao fato
        // do .put ter a funcionalidade de atualizar o elemento

        System.out.println(usuarios);
        System.out.println(usuarios.size());

        //keySet é um conjunto não ordenado
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        //Existe o contains para key e value
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Diego"));

        // É possível percorrer a chave, valor ou os dois.

        for (Integer i: usuarios.keySet()
             ) {
            System.out.println(i);
        }
        for (String i: usuarios.values()
             ) {
            System.out.println(i);
        }

        for (Map.Entry<Integer,String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey()+" ==>");
            System.out.println(registro.getValue());
        }

    }
}
