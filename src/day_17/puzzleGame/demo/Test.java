package day_17.puzzleGame.demo;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        shuffle(tempArr);
        int[][] newArr = change(tempArr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(Arrays.toString(newArr[i]));
        }
    }

    private static int[][] change(int[] tempArr) {
        int[][] result = new int[4][4];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            for (int i1 = 0; i1 < result[i].length; i1++) {
                result[i][i1] = tempArr[index];
                index++;
            }
        }
        return result;
    }

    private static void shuffle(int[] tempArr) {
        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = random.nextInt(tempArr.length);
            swap(tempArr, i, index);
        }
    }

    private static void swap(int[] tempArr, int i, int index) {
        int num = tempArr[i];
        tempArr[i] = tempArr[index];
        tempArr[index] = num;
    }
}
