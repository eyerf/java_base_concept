package day_23;

import java.util.Arrays;

public class LambdaDemo4 {
    public static void main(String[] args) {
        String[] arr = {"a", "aaaa", "aaa", "aa"};
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
