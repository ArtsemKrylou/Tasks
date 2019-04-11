package selectioncommittee.Humans;

import selectioncommittee.Facultet;

import java.util.Objects;

public class Student {

   public String name;
   public Facultet facultet;
   public Certificate certificate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(facultet, student.facultet) &&
                Objects.equals(certificate, student.certificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, facultet, certificate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", facultet=" + facultet +
                ", certificate=" + certificate +
                '}';
    }
}
