import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intList18 = {1, 2, 3, 2, 4, 5, 5, 6};
        ArrayList<Integer> modes = ArrayListAlgorithms.modes(intList18);
        System.out.println(modes);

        int[] intList19 = {1, 2, 6, 2, 3, 4, 6, 5, 5, 6, 7};
        ArrayList<Integer> modes2 = ArrayListAlgorithms.modes(intList19);
        System.out.println(modes2);

        int[] intList20 = {1, 2, 1, 2, 4, 1, 2, 4, 1, 1, 3};
        ArrayList<Integer> modes3 = ArrayListAlgorithms.modes(intList20);
        System.out.println(modes3);

        int[] intList21 = {1, 2, 3, 4, 3, 2, 1, 4, 1, 2, 3};
        ArrayList<Integer> modes4 = ArrayListAlgorithms.modes(intList21);
        System.out.println(modes4);

        // all numbers appear 1 time
        int[] intList22 = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes5 = ArrayListAlgorithms.modes(intList22);
        System.out.println(modes5);

        // all numbers appear 3 times
        int[] intList23 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes6 = ArrayListAlgorithms.modes(intList23);
        System.out.println(modes6);

        // this one has an extra 7, so 1, 2, 3, 4, 5, and 6 are all modes!
        int[] intList24 = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes7 = ArrayListAlgorithms.modes(intList24);
        System.out.println(modes7);
    }
}
