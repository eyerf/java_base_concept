package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringDemo13 {
    public static void main(String[] args) {
        ArrayList<String> menList = new ArrayList<>();
        ArrayList<String> womenList = new ArrayList<>();
        Collections.addAll(menList, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖粱粱,27");
        Collections.addAll(womenList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        Stream<String> stream1 = menList.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);

        Stream<String> stream2 = womenList.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);

//        Stream.concat(stream1, stream2).map(new Function<String, Actor>() {
//            @Override
//            public Actor apply(String s) {
//                String name = s.split(",")[0];
//                int age = Integer.parseInt(s.split(",")[1]);
//                return new Actor(age, name);
//            }
//        }).forEach(s -> System.out.println(s));

        List<Actor> list = Stream.concat(stream1, stream2).map(s -> new Actor(Integer.parseInt(s.split(",")[1]), s.split(",")[0])).collect(Collectors.toList());
        System.out.println(list);
    }
}

class Actor {
    private int age;
    private String name;

    public Actor() {
    }

    public Actor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return age == actor.age && Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


