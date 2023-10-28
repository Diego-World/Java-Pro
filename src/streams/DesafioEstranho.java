package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioEstranho {
    public static void main(String[] args) {
        /*
        * Requisitos: Duas expressões lambadas para dois filtros e um map
        *
        * */

        List<Agente> agentes = new ArrayList<>();

        agentes.add(new Agente("Diego.Gouveia","123",true));
        agentes.add(new Agente("Diana.Lica","123",true));
        agentes.add(new Agente("Pietro.PG","123",false));
        agentes.add(new Agente("Specter.Paul","123",true));
        agentes.add(new Agente("Marlo.James","123",true));
        agentes.add(new Agente("Abner.Levi","123",false));
        agentes.add(new Agente("Sasdokcxc","123",false));
        agentes.add(new Agente("Skivinding","123",true));
        agentes.add(new Agente("Plos","123",false));

        Predicate<Agente> gouveia = gouveiaAgents -> {
            if(gouveiaAgents.getUsername().contains("Gouveia")){
                return true;
            }
            return false;
        };
        Predicate<Agente> ativos = activeAgents -> activeAgents.isActive();

        Function<Agente,String> searchedAgents = agent -> "Agente encontrados: " + agent.getUsername() + "!";

        agentes.stream().filter(gouveia).filter(ativos).map(searchedAgents).forEach(System.out::println);

    }
}
