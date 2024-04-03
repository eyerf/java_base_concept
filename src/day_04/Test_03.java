package day_04;

public class Test_03 {
    public static void main(String[] args) {
        double thick = 0.1;
        int count = 0;
        while (thick < (double) 8844430) {
            thick *= 2;
            count++;
        }
        System.out.println("count = " + count);
        System.out.println("thick = " + thick);
    }
}
