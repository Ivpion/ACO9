package Classwork.week5.day2;


import java.util.Arrays;

/**
 * Created by ivan on 06.12.15.
 */
public class ArrayUtils {

    public static void getKey(int[] mas, int key, int start, int end, int count){

        int search = start + (end - start) / 2;
        if (search > key){
            end = search;
        } else if (key > search){
            start = search;
        } else {
            key = search;
        }

        if (search != key) {
            count++;
            getKey(mas, key, start, end, count);
        }
        else
        System.out.println("Number " + search + " Kill " + count +" stack");
    }

    public static int[] generateArray(int size){
        int t = 1;
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = t;
            t++;
        }
        return mas;
    }

    public static int generateRandomKey(int sizeOfArray){
        int key = (int) (Math.random() * sizeOfArray);
        return key;
    }

}
