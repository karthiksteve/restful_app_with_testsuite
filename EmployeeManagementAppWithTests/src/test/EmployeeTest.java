import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    public void testEmployeeCreation() {
        Employee emp = new Employee("104", "Alice", "Brown", "alice.brown@example.com", "HR Manager");
        assertEquals("104", emp.getEmployee_id());
        assertEquals("Alice", emp.getFirst_name());
        assertEquals("Brown", emp.getLast_name());
        assertEquals("alice.brown@example.com", emp.getEmail());
        assertEquals("HR Manager", emp.getTitle());
    }
}