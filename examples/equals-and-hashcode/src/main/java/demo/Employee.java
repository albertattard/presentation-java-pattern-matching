package demo;

import java.util.Objects;

public class Employee {

    private final long id;
    private final String name;

    public Employee(final long id, final String name) {
        this.id = id;
        this.name = name;
    }

//    @Override
//    public boolean equals(final Object object) {
//        if (this == object) {
//            return true;
//        }
//
//        if (object instanceof Employee) {
//            final Employee employee = (Employee) object;
//            return id == employee.id && Objects.equals(name, employee.name);
//        }
//
//        return false;
//    }

    @Override
    public boolean equals(final Object object) {
        return this == object
                || object instanceof Employee employee
                && id == employee.id
                && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
