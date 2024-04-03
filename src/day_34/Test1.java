package day_34;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\code\\java_base_concept\\aaa");
        boolean result = file.mkdirs();
        System.out.println(result);


        String name = "a.txt";
        File file1 = new File(file, name);
        boolean newFile = file1.createNewFile();
        System.out.println(newFile);
    }
}
