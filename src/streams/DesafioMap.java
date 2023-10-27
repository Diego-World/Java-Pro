package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        nums.stream().map(Integer::toBinaryString).map(DesafioMap::reverte).map(DesafioMap::binaryInt).forEach(System.out::println);

    }

    static String reverte(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    static int binaryInt(String s){
        int bi = Integer.parseInt(s,2);
        return bi;
    }
}
