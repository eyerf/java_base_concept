package day_23;

public class LambdaDemo2 {
    public static void main(String[] args) {
//        method(new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("正在游泳~~~");
//            }
//        });

        method(() -> {
            System.out.println("正在游泳~~~");
        });
    }

    public static void method(Swim swim) {
        swim.swimming();
    }
}


@FunctionalInterface
interface Swim {
    public abstract void swimming();
}
