package day_33;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\18345\\Desktop");
        File[] files = file.listFiles();

        for (File currfile : files) {
            System.out.println(currfile);
        }
    }
}
