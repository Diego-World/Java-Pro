package Excecao.PersonalizadaB;

public class ChecadaVsNotChecked {
    public static void main(String[] args) {
        try {
            getErro1();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        getErro2();

        System.out.println("Fim :)");
    }

    static void getErro1(){
        throw new RuntimeException("O correu um erro #01!");
    }
    static void getErro2(){
        try {
            throw new Exception("O correu um erro #01!");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
