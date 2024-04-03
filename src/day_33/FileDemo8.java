package day_33;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\18345\\Desktop");
        File[] files = file.listFiles();
        for (File currFile : files) {
            if (currFile.isFile() && currFile.getName().endsWith(".txt")) {
                System.out.println(currFile);
            }
        }
    }
}
