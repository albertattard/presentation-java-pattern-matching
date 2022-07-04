package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void returnTrueWhenEmployeeFieldsAreEqualFalseOtherwise() {
        final Employee a = new Employee(1, "Albert");
        final Employee b = new Employee(1, "Albert");
        final Employee c = new Employee(2, "Rodianne");

        assertEquals(a, b);
        assertEquals(b, a);
        assertNotEquals(a, c);
        assertNotEquals(c, a);
    }
}