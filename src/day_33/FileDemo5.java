package day_33;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\18345\\Desktop\\ggg");
//        System.out.println(file.mkdirs());
        System.out.println(file.delete());
    }
}
