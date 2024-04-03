package day_18.runtime;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
//        Runtime runtime1 = Runtime.getRuntime();
//        Runtime runtime2 = Runtime.getRuntime();
//        runtime1.exit(0);
//        System.out.println(Runtime.getRuntime().availableProcessors());

//        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
//
//        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
//
//        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        Runtime.getRuntime().exec("shutdown -a");
    }
}
