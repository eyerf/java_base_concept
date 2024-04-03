package day_34;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\18345\\Desktop");
        long len = getLen(file);
        System.out.println(len);
    }

    public static long getLen(File file) {
        long len = 0;
        File[] files = file.listFiles();
        if (files != null) {
            for (File currfile : files) {
                if (currfile.isFile()) {
                    len += currfile.length();
                } else {
                    len += getLen(currfile);
                }
            }
        }
        return len;
    }
}
