package CodeWars;

public class Test04 {
    public static void main(String[] args) {

        String a = "Test";
        String b = "Testing";
        System.out.println(getMiddle(a));
        System.out.println(getMiddle(b));
    }
     static String getMiddle(String word){
        if(word.length() % 2 ==0){
            return word.substring((word.length()/2)-1,(word.length()/2)+1);
        }else{
            return word.substring((word.length()/2),(word.length()/2)+1);
        }
    }
}
