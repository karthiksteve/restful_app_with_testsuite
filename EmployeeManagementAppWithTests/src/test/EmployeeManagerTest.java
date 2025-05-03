import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
    @Test
    public void testGetEmployees() {
        Employees employees = EmployeeManager.getEmployees();
        assertNotNull(employees);
        assertTrue(employees.getEmployeeList().size() > 0);
    }
}