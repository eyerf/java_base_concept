package day_25;

import java.util.ArrayList;

public class GenericDemo6 {
    public static void main(String[] args) {

    }

    public static void method(ArrayList<? extends Ye> list) {

    }
}
class Ye {}
class Fu extends Ye{}
class Zi extends Fu{}

class Student2 {}