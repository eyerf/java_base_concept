package day_14.staticDemo.studentDemo;

import java.util.List;

public class StudentUtil {
    private StudentUtil() {}

    public static int getMaxAgeStudent(List<Student>list) {
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            max = Math.max(list.get(i).getAge(), max);
        }
        return max;
    }
}
