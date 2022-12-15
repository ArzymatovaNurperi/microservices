package training.Kurmanbek;

import java.util.Objects;

public class Kurmanbek{
    private int id;
    private String name;

    public Kurmanbek(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        Kurmanbek kurmanbek = (Kurmanbek) o;
        return id == kurmanbek.id && Objects.equals(name, kurmanbek.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Kurmanbek{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
