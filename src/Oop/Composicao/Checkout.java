package Oop.Composicao;

public class Checkout {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.nomeCliente = "Diego";
        c1.adicionarItem("Iphone 15 Pro Max",2,9000.00);
        c1.adicionarItem("Camera Profissional Sony",1,7000.00);
        c1.adicionarItem("Tripé",3,2300.00);

        System.out.println(c1);
        System.out.println(c1.itens.size());
        System.out.println(c1.nomeCliente);
        System.out.println(c1.getValorTotal());
    }
}
