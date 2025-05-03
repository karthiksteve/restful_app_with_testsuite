import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmployeesTest {
    @Test
    public void testAddEmployee() {
        Employees employees = new Employees();
        Employee emp = new Employee("105", "Bob", "White", "bob.white@example.com", "Marketing Lead");
        employees.addEmployee(emp);
        assertEquals(1, employees.getEmployeeList().size());
    }
}