package day_33;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo7 {
    public static void main(String[] args) {
//        File[] files = File.listRoots();
//        System.out.println(Arrays.toString(files));

//        File file = new File("C:\\Users\\18345\\Desktop");
//        String[] list = file.list();
//        for (String string : list) {
//            System.out.println(string);
//        }

        File file = new File("C:\\Users\\18345\\Desktop");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                System.out.println(src);
                if (src.isFile() && name.endsWith(".txt")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        System.out.println(Arrays.toString(list));
    }
}
