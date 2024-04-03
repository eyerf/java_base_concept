package day_13;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        String str = "abcdefg";
        str = shuffle(str);
        System.out.println(str);
    }

    private static String shuffle(String str) {
        char[] array = str.toCharArray();
        Random rd = new Random();
        for(int i = 0; i < array.length; i++) {
            swap(array, i, rd.nextInt(array.length));
        }
        return new String(array);
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
