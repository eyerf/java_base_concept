package day_14.studentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSystem {
    public static void startSystem() {
        List<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("---------------欢迎来到黑马学生管理系统---------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    private static void queryStudent(List<Student> list) {
        if (list.isEmpty()) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t\t\t姓名\t年龄\t家庭住址");
        for (Student stu : list) {
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    private static void updateStudent(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index < 0) {
            System.out.println("要修改的id不存在，请重新输入!");
            return;
        }
        else {
            Student student = list.get(index);
            System.out.println("请输入要修改的学生的姓名");
            student.setName(sc.next());
            System.out.println("请输入要修改的学生的年龄");
            student.setAge(sc.nextInt());
            System.out.println("请输入要修改的学生的家庭住址");
            student.setAddress(sc.next());
            System.out.println("学生信息修改成功");
        }
    }

    private static void deleteStudent(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();
        int index = getIndex(list, id);
        if(index >= 0) {
            list.remove(index);
            System.out.println("id为" + id + "的学生删除成功!");
        }
        else {
            System.out.println("id不存在，删除失败!");
        }
    }

    private static void addStudent(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            if(contains(list, id)) {
                System.out.println("id已经存在，请重新输入");
            }
            else {
                break;
            }
        }
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        Student student = new Student(id, name, age, address);
        list.add(student);
        System.out.println("学生信息添加成功");
    }

    public static boolean contains(List<Student> list, String id) {
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(List<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            String sid = student.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
