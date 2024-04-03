package day_26;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        ClassStudent classStudent1 = new ClassStudent("zhangsan", 23, 90, 99, 50);
        ClassStudent classStudent2 = new ClassStudent("lisi", 24, 90, 98, 50);
        ClassStudent classStudent3 = new ClassStudent("wangwu", 25, 95, 100, 30);
        ClassStudent classStudent4 = new ClassStudent("zhaoliu", 26, 60, 99, 70);
        ClassStudent classStudent5 = new ClassStudent("qianqi", 26, 70, 80, 70);

        TreeSet<ClassStudent> set = new TreeSet<>();
        set.add(classStudent1);
        set.add(classStudent2);
        set.add(classStudent3);
        set.add(classStudent4);
        set.add(classStudent5);

        for (ClassStudent classStudent : set) {
            System.out.println(classStudent + " 总分为:" + (classStudent.getChineseGrade() + classStudent.getMathGrade() + classStudent.getEnglishGrade()));
        }
    }
}

class ClassStudent implements Comparable<ClassStudent> {
    private String name;
    private int age;
    private int chineseGrade;
    private int mathGrade;
    private int englishGrade;

    public ClassStudent() {
    }

    public ClassStudent(String name, int age, int chineseGrade, int mathGrade, int englishGrade) {
        this.name = name;
        this.age = age;
        this.chineseGrade = chineseGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
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

    public int getChineseGrade() {
        return chineseGrade;
    }

    public void setChineseGrade(int chineseGrade) {
        this.chineseGrade = chineseGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    @Override
    public String toString() {
        return "ClassStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chineseGrade=" + chineseGrade +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassStudent that = (ClassStudent) o;
        return age == that.age && chineseGrade == that.chineseGrade && mathGrade == that.mathGrade && englishGrade == that.englishGrade && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, chineseGrade, mathGrade, englishGrade);
    }


    @Override
    public int compareTo(ClassStudent o) {
        int sum1 = this.chineseGrade + this.englishGrade + this.mathGrade;
        int sum2 = o.getChineseGrade() + o.getEnglishGrade() + o.getMathGrade();
        if (sum1 != sum2) {
            return sum2 - sum1;
        } else if (this.chineseGrade != o.getChineseGrade()) {
            return o.getChineseGrade() - this.chineseGrade;
        } else if (this.mathGrade != o.getMathGrade()) {
            return o.getMathGrade() - this.getMathGrade();
        } else if (this.getEnglishGrade() != o.getEnglishGrade()) {
            return o.getEnglishGrade() - this.getEnglishGrade();
        } else if (this.age != o.getAge()) {
            return o.getAge() - this.age;
        } else if (!this.name.equals(o.getName())) {
            return o.getName().compareTo(this.name);
        } else {
            return 0;
        }
    }
}
