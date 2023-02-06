import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myWordList = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "donut", "bagel", "danish", "berry", "baguette", "soda"));
        ArrayListAlgorithms.moveBWords(myWordList);
        System.out.println(myWordList);

        ArrayList<String> myWordList2 = new ArrayList<String>(Arrays.asList("apple", "cherry", "donut", "danish", "soda", "banana", "bagel",  "berry", "baguette"));
        ArrayListAlgorithms.moveBWords(myWordList2);
        System.out.println(myWordList2);

        ArrayList<String> myWordList3 = new ArrayList<String>(Arrays.asList("banana", "bagel",  "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"));
        ArrayListAlgorithms.moveBWords(myWordList3);
        System.out.println(myWordList3);
    }
}
