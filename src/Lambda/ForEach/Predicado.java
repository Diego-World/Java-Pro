package Lambda.ForEach;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isExpensive =
                produto -> (produto.preco * (1- produto.desconto) >= 750);

        Produto produto = new Produto("Iphone",4000.00,0.1);
        System.out.println(isExpensive.test(produto));


    }
}
