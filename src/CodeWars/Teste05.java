package CodeWars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste05 {
    public static void main(String[] args) {

        String first = "abracadabra";
        String seccond = "";
        String third = "pear tree";

        char[] vogais = {'a','e','i','o','u'};
        int count = 0;
        for (char x:first.toCharArray()) {
            for (char y:vogais) {
                if(x == y){
                    count++;
                }
            }
        }
        System.out.println(count);

        int vowelsCount = 0;
        for(char c : third.toCharArray())
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        System.out.println(vowelsCount);
    }

}
