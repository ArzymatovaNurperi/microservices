package training.dilnaz;

import java.util.Objects;

public class Dilnaz {
    private int id;
    private String name;

    public Dilnaz(int id, String name) {
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
    public String toString() {
        return "Dilnaz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dilnaz dilnaz = (Dilnaz) o;
        return id == dilnaz.id && Objects.equals(name, dilnaz.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
