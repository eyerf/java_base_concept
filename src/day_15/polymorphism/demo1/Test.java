package day_15.polymorphism.demo1;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(18);

        Teacher teacher = new Teacher();
        teacher.setName("wangjianguo");
        teacher.setAge(30);

        Administrator administrator = new Administrator();
        administrator.setName("administrator");
        administrator.setAge(35);

        register(student);
        register(teacher);
        register(administrator);
    }

    public static void register(Person person) {
        person.show();
    }
}
