package arrays;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10;
        }

        System.out.println(Arrays.toString(array));
    }
}
