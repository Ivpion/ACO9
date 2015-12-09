package Classwork.week5.day2;



import java.util.Arrays;

import static Classwork.week5.day2.ArrayUtils.generateArray;
import static Classwork.week5.day2.ArrayUtils.generateRandomKey;

/**
 * Created by ivan on 06.12.15.
 */
public class TestArray {
    public static void main(String[] args) {
        int size = 10;
        int count = 0;
        int search = generateRandomKey(size);
        int[] arr = generateArray(size);

        System.out.println(Arrays.toString(arr));
        ArrayUtils.getKey(arr, search, 0, size,count);

    }
}
