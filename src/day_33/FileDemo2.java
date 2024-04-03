package day_33;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\18345\\Desktop\\temp.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
    }
}
