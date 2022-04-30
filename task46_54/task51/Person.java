package task46_54.task51;

import java.io.Serializable;

public class Person implements Serializable {

    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
