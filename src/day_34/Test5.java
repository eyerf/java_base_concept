package day_34;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\18345\\Desktop\\aaa");
        deleteDirectory(file);
    }


    private static void deleteDirectory(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File currFile : files) {
                boolean delete = currFile.delete();
                if (!delete) {
                    deleteDirectory(currFile);
                }
            }
        }
        file.delete();
    }
}
