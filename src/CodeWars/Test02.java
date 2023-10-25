package CodeWars;

import java.util.HashSet;
import java.util.Set;


public class Test02 {

    public static void main(String[] args) {
        System.out.println(converte("Diego"));
        System.out.println(converte("Diana"));
    }




    static boolean converte(String str){
        Set<Character> charSet = new HashSet<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }
}
