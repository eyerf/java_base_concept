package day_34;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        File[] files = getAviFile("C:\\Users\\18345\\Desktop");
        System.out.println(Arrays.toString(files));
    }

    private static File[] getAviFile(String url) {
        File file = new File(url);
        return file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".avi");
            }
        });
    }
}
