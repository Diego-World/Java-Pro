package Oop.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void adicionarItem(Item item){
        this.itens.add(item);
    }

    double getValorCompra(){
        double total = 0;
        if(!itens.isEmpty()){
            for(Item i:this.itens) {
                total += i.produto.preco * i.quantidade;
            }
        }
        return total;
    }
}

