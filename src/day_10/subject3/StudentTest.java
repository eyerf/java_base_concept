package day_10.subject3;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student("1", "zhangsan", 23);
        Student stu2 = new Student("2", "lisi", 24);
//        Student stu3 = new Student("3", "wangwu", 25);
        arr[0] = stu1;
        arr[1] = stu2;
//        arr[2] = stu3;
        Student stu4 = new Student("4", "zhaoliu", 26);
        if(alreadyExist(arr, stu4.getStudentID())) {
            System.out.println("当前id重复，请修改id后再进行添加");
        } else {
            int index = getNextIndex(arr);
            if(index == -1) {
                arr = add(arr, stu4);
            }
            else{
                arr[index] = stu4;
            }
        }
        for (Student student : arr) {
            System.out.println(student);
        }
    }

    private static Student[] add(Student[] arr, Student stu) {
        Student[] result = new Student[arr.length + 1];
        System.arraycopy(arr, 0, result, 0, arr.length);
        result[result.length - 1] = stu;
        return result;
    }

    private static int getNextIndex(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private static boolean alreadyExist(Student[] arr, String studentID) {
        for (Student student : arr) {
            if (student != null && student.getStudentID().equals(studentID)) {
                return true;
            }
        }
        return false;
    }
}
