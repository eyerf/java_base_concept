package day_33;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
//        String str = "C:\\User\\alienware\\Desktop\\a.txt";
//        File file = new File(str);
//        System.out.println(file);

//        String parent = "C:\\User\\alienware\\Desktop";
//        String child = "a.txt";
//        File file = new File(parent, child);
//        System.out.println(file);

        File parent = new File("C:\\User\\alienware\\Desktop");
        String child = "a.txt";
        File file = new File(parent, child);
        System.out.println(file);
    }
}
