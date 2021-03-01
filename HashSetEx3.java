import java.util.HashSet;

public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        // 나이와 이름이 같으면 같은 사람으로 인식하게 하려고 했으나, 다른 객체로 인식하여 2번 출력됨.

        System.out.println(set);
    }

}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ": " + age;
    }
}
