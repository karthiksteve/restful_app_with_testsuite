# Employee Management REST API

This project is a simple RESTful web service built with Java and Spring Boot. It manages employee records and supports CRUD operations via HTTP endpoints. The repository also includes a complete test suite to validate each component of the application.

## 🔧 Technologies Used

- Java
- Spring Boot
- Maven
- JUnit (for testing)

---

Project Structure

EmployeeManagementAppWithTests/
├── src/
│ ├── main/
│ │ └── java/com/example/employee/
│ │ ├── Employee.java
│ │ ├── Employees.java
│ │ ├── EmployeeManager.java
│ │ ├── EmployeeController.java
│ │ └── RestServiceApplication.java
│ └── test/
│ └── java/com/example/employee/
│ ├── EmployeeTest.java
│ ├── EmployeesTest.java
│ ├── EmployeeManagerTest.java
│ └── EmployeeControllerTest.java


Features

- Create, Read, Update, Delete (CRUD) employee records.
- In-memory storage for quick and lightweight testing.
- Fully unit-tested service and controller layers.



## 🚀 How to Run the Application

### Prerequisites

- Java 8 or higher
- Maven
- IDE like IntelliJ IDEA or Eclipse (optional)

### Steps

1. Clone or download this repository.
2. Open the project in your IDE or terminal.
3. Navigate to the main class:
4. Run the application as a Java application or use Maven:

#### Test Coverage
EmployeeTest: Tests model object creation and behavior.

EmployeesTest: Verifies the wrapper list of employees.

EmployeeManagerTest: Checks business logic operations (add, delete, update).

EmployeeControllerTest: Tests REST API responses using mocked service.
