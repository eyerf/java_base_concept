package day_24;

public class Test3 {
    public static void main(String[] args) {
        int result = getResult(1);
        System.out.println(result);
    }

    private static int getResult(int day) {
        if(day == 10) {
            return 1;
        }
        return (getResult(day + 1) + 1) * 2 ;
    }
}
