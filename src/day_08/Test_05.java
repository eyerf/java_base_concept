package day_08;

import java.util.Arrays;
import java.util.Random;

public class Test_05 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        Random rd = new Random();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = rd.nextInt(101);
        }
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        scores[0] = scores[5] = 0;
        int sum = Arrays.stream(scores).sum();
        System.out.println(sum / 4);
    }
}
