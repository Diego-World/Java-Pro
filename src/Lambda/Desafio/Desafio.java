package Lambda.Desafio;

import Lambda.ForEach.Produto;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    final Locale us = Locale.US;

    public static void main(String[] args) {

        Produto p = new Produto("Iphone 12", 3500.00, 0.13);

        /*
         * 1. A partir do produto calcular o preço real (com desconto) - Feito
         * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento) - Feito
         * 3. Frete: >= 3000 (100) / < 3000 (50) - Feito
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$ 1234,56 - Feito
         * */


        Function<Produto, Double> precoFinal =
                produto -> produto.getPreco() * (1 - produto.getDesconto());
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(",", ".");

        System.out.println(precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p));

    }

}