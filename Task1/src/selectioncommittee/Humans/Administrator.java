package selectioncommittee.Humans;

import java.util.Objects;

public class Administrator {

    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Administrator)) return false;
        Administrator that = (Administrator) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "name='" + name + '\'' +
                '}';
    }
}
