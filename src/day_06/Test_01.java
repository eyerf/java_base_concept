package day_06;

public class Test_01 {
    public static void main(String[] args) {
        double R = 1.5;
        double area = getCircleArea(R);
        System.out.println(area);
    }

    private static double getCircleArea(double radius) {
        double result = radius * radius * 3.14;
        return result;
    }
}
