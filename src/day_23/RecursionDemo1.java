package day_23;

public class RecursionDemo1 {
    public static void main(String[] args) {
        int result = getFactorial(5);
        System.out.println(result);
    }

    private static int getFactorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * getFactorial(number - 1);
    }
}
