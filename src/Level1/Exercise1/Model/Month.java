package Level1.Exercise1.Model;

import java.util.Objects;

public class Month implements Comparable<Month> {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Equality check for HashSet and LinkedHashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Month)) return false;
        Month month = (Month) o;
        return Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // Natural ordering by name
    @Override
    public int compareTo(Month other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
