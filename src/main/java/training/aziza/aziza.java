package training.aziza;

import java.util.Objects;

public class aziza {
    private int age;
    private String name;

    public aziza(int age, String name) {
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
        aziza aziza = (aziza) o;
        return age == aziza.age && Objects.equals(name, aziza.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "aziza{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
