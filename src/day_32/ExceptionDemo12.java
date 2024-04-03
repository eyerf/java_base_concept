package day_32;

import java.util.Arrays;

public class ExceptionDemo12 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("索引越界异常");
        }
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        }
        if (arr.length == 0) {
            throw new IndexOutOfBoundsException();
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}
