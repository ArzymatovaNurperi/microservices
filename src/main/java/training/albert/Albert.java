package training.albert;

import java.util.Objects;

public class Albert {
    private int Id;
    private String name;

    public Albert(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
        Albert albert = (Albert) o;
        return Id == albert.Id && Objects.equals(name, albert.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name);
    }

    @Override
    public String toString() {
        return "Albert{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
