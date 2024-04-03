package day_08;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test_07 {
    public static void main(String[] args) {
        int[] rewards = {2, 588, 888, 1000, 10000};
        Random rd = new Random();
        Set<Integer> set = new HashSet<>();
        int count = 0;
        while (count < 5) {
            int index = rd.nextInt(5);
            if(!set.contains(index)) {
                set.add(index);
                System.out.print(rewards[index]);
                if(count != 4) {
                    System.out.print(" ");
                }
                count++;
            }
        }
    }
}
