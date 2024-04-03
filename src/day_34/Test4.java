package day_34;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("C:\\");
        findAvi(file);
    }

    private static void findAvi() {
        File[] files = File.listRoots();
        for (File file : files) {
            findAvi(file);
        }
    }

    private static void findAvi(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file);
                }
                if (file.isDirectory()) {
                    findAvi(file);
                }
            }
        }
    }
}
