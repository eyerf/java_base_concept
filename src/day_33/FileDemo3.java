package day_33;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\18345\\Desktop\\temp.txt");
//        long length = file.length();
//        System.out.println(length);

//        File file = new File("C:\\\\Users\\\\18345\\\\Desktop\\\\temp.txt");
//        String path1 = file.getAbsolutePath();
//        System.out.println(path1);

//        File file = new File("D:\\code\\java_base_concept\\temp.txt");
//        System.out.println(file.exists());

        File file = new File("D:\\code\\java_base_concept\\temp.txt");
        String name = file.getName();
        System.out.println(name);
    }
}
