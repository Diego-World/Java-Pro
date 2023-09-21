package Oop.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }
    double getValorGasto(){
        double total = 0;
        if(!compras.isEmpty()){
            for(Compra compra:this.compras) {
                total += compra.getValorCompra();
            }
        }
        return total;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
}
