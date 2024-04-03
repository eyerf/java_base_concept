package day_18.mathDemo;

public class MathDemo2 {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(10));
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <=  Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
