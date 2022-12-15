package training.aidai;

import java.util.Objects;

public class Aidai {
    private String name;
    private int age1;

    public Aidai(String name, int age) {
        this.name = name;
        this.age1 = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age1;
    }

    public void setAge(int age) {
        this.age1 = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aidai aidai = (Aidai) o;
        return age1 == aidai.age1 && Objects.equals(name, aidai.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age1);
    }

    @Override
    public String toString() {
        return "Aidai{" +
                "name='" + name + '\'' +
                ", age=" + age1 +
                '}';
    }
}
