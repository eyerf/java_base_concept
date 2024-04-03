package day_15.polymorphism.demo3.test2;

public class Test {
    public static void main(String[] args) {
        final double PI = 3.14;
        final Student S = new Student("zhangsan", 23);
        S.setAge(24);
        S.setName("lisi");
        System.out.println(S);

        final int[]  ARR = {1, 2, 3, 4, 5};
        ARR[0] = 10;
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }
    }
}
