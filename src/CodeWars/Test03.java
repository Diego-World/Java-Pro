package CodeWars;

import java.util.regex.Pattern;

public class Test03 {
    public static void main(String[] args) {

        String a = "12.34";
        String b = "1234.5";
        String c = "a234641654";

        System.out.println(valido(a));
        System.out.println(valido(b));
        System.out.println(valido(c));
    }



    static boolean valido(String pin){
        String regex = "[0-9]{4}|[0-9]{6}";
        if(pin.length() < 6 || pin.length() > 4){
            return false;
        }else if(pin.matches(regex)){
            return true;
        }else{
            return true;
        }
    }



}
