package Oop.Composicao.Desafio;

public class Shopping {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Diego");

        Compra c1 = new Compra();
        c1.adicionarItem(new Item(new Produto("Fogão",1000.00),1));
        c1.adicionarItem(new Item(new Produto("Geladeira",3500.00),1));
        c1.adicionarItem(new Item(new Produto("Máquina de lavar",2000.00),1));
        c1.adicionarItem(new Item(new Produto("Secadora",3800.00),1));
        c1.adicionarItem(new Item(new Produto("Conjunto Cama box",2700.00),1));
        c1.adicionarItem(new Item(new Produto("Sofá",2000.00),1));
        c1.adicionarItem(new Item(new Produto("Televisão",2500.00),1));

        System.out.println(c1.getValorCompra());

        Compra c2 = new Compra();
        c2.adicionarItem(new Item(new Produto("Iphone 14",3500.00),2));
        c2.adicionarItem(new Item(new Produto("Suporte para Notebook",100.00),1));
        c2.adicionarItem(new Item(new Produto("Luminária de mesa",100.00),1));
        c2.adicionarItem(new Item(new Produto("Mesa para computador",500.00),1));

        System.out.println(c2.getValorCompra());

        cliente1.adicionarCompra(c1);
        cliente1.adicionarCompra(c2);

        System.out.println(cliente1.getValorGasto());
    }
}
