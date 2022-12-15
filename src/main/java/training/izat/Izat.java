package training.izat;

import java.util.Objects;

public class Izat {
    private Long id;
    private String name;

    public Izat(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        Izat izat = (Izat) o;
        return Objects.equals(id, izat.id) && Objects.equals(name, izat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Izat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
