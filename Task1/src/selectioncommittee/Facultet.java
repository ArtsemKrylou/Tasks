package selectioncommittee;

import java.util.Objects;

public class Facultet {

    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Facultet)) return false;
        Facultet facultet = (Facultet) o;
        return Objects.equals(name, facultet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Facultet{" +
                "name='" + name + '\'' +
                '}';
    }
}
