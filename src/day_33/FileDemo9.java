package day_33;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo9 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\18345\\Desktop");
//        File[] files = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isFile() && pathname.getName().endsWith(".txt");
//            }
//        });
//
//        System.out.println(Arrays.toString(files));


        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile = new File(dir, name);
                return currFile.isFile() && currFile.getName().endsWith(".txt");
            }
        });

        System.out.println(Arrays.toString(files));
    }
}
