package CodeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String input = "Hello World By java";

        String[] inputSplited = input.split(" ");
        List<String> inputList = Arrays.asList(inputSplited);
        String result = inputList.stream().map(x -> reverse(x)).collect(Collectors.joining(" "));

    }

    static String reverse(String word){
        String[] splittedWord = word.split("");
        String result = "";
        for (int y = splittedWord.length; y != 0; y--){
            result = result.concat(splittedWord[y-1]);
        }
        return result;
    }

}


