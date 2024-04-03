package day_18.systemDemo;

public class SystemDemo {
    public static void main(String[] args) {
//        System.exit(1);

//        System.out.println(System.currentTimeMillis());

//        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr2 = new int[10];
//        System.arraycopy(arr1, 6, arr2, 2, 3);
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }

        Student student1 = new Student("zhangsan", 23);
        Student student2 = new Student("lisi", 24);
        Student student3 = new Student("wangwu", 25);
        Student[] arr1 = {student1, student2, student3};
        Student[] arr2 = new Student[3];
        System.arraycopy(arr1, 0, arr2, 0, 3);
        for (int i = 0; i < arr2.length; i++) {
            Student student = (Student) arr2[i];
            System.out.println(student);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

}
