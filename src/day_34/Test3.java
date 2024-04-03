package day_34;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<File[]> list = new ArrayList<>();
        File[] files = File.listRoots();
        for (File file : files) {
            getAllAviInDirectory(file, list);
        }

//        File file = new File("C:\\Users\\18345\\Desktop");
//        getAllAviInDirectory(file, list);


        for (File[] files1 : list) {
            System.out.println(Arrays.toString(files1));
        }
    }

    private static void getAllAviInDirectory(File file, List<File[]> list) {
        File[] aviInDirectory = getAviInDirectory(file);
        if (aviInDirectory != null && aviInDirectory.length != 0) {
            list.add(aviInDirectory);
        }
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    getAllAviInDirectory(file1, list);
                }
            }
        }
    }

    public static File[] getAviInDirectory(File file) {
        return file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".avi");
            }
        });
    }
}
