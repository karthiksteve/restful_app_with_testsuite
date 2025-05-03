import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class EmployeeControllerTest {
    private final EmployeeController controller = new EmployeeController();

    @Test
    public void testGetAllEmployees() {
        Employees employees = controller.getAllEmployees();
        assertNotNull(employees);
        assertTrue(employees.getEmployeeList().size() > 0);
    }

    @Test
    public void testAddEmployee() {
        Employee newEmployee = new Employee("106", "Charlie", "Green", "charlie.green@example.com", "Sales Executive");
        controller.addEmployee(newEmployee);
        Employees employees = controller.getAllEmployees();
        assertTrue(employees.getEmployeeList().contains(newEmployee));
    }
}