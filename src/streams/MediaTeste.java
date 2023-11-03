package streams;

public class MediaTeste {
    public static void main(String[] args) {
        Media m1 = new Media();
        m1.adicionar(9.8);
        m1.adicionar(6.7);
        m1.adicionar(4.7);
        m1.adicionar(4.7);

        Media m2 = new Media();
        m2.adicionar(10);
        m2.adicionar(8.7);
        m2.adicionar(7.7);
        m2.adicionar(10.7);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());
        System.out.println(Media.combinar(m1,m2).getValor());
    }
}
