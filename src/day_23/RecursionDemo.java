package day_23;

public class RecursionDemo {
    public static void main(String[] args) {
        int sum = calculateNumber(0,  0, 100);
        System.out.println(sum);
    }

    private static int calculateNumber(int currNumber, int sumNumber, int endNumber) {
        sumNumber += currNumber;
        if(currNumber >= endNumber) {
            return sumNumber;
        }
        return calculateNumber(currNumber + 1, sumNumber, endNumber);
    }
}
