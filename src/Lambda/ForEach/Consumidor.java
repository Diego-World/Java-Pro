package Lambda.ForEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir =
                p -> System.out.println(p.nome + "!");

        Produto produto = new Produto("Iphone 12",4000.00,0.05);
        Produto produto1 = new Produto("Iphone 14",5000.00,0.10);
        Produto produto2 = new Produto("Iphone 15",6000.00,0.15);

        imprimir.accept(produto);

        List<Produto> produtos =
                Arrays.asList(produto,produto1,produto2);

        produtos.forEach(imprimir);
    }
}
