package Bekbol;

import java.util.Objects;

public class Bekbol {
    private int id;
    private String name;

    public Bekbol(int id, String name) {
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
        Bekbol bekbol = (Bekbol) o;
        return id == bekbol.id && Objects.equals(name, bekbol.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Bekbol{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
