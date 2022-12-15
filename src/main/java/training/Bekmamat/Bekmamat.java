package training.Bekmamat;

import java.util.Objects;

public class Bekmamat {
    private int id;
    private String nam;

    public Bekmamat(int id, String nam) {
        this.id = id;
        this.nam = nam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "Bekmamat{" +
                "id=" + id +
                ", nam='" + nam + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bekmamat bekmamat = (Bekmamat) o;
        return id == bekmamat.id && Objects.equals(nam, bekmamat.nam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nam);
    }
}
