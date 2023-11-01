package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TC3_add_Employee {
    private EmployeeMock employeeMock;

    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @Test
    void TC3_addEmployee() {

        Employee newEmployee = new Employee();
        newEmployee.setId(8); // Set ID
        newEmployee.setLastName("H4nt"); // Set Last Name
        newEmployee.setFirstName("Cosm6n"); // Set First Name
        newEmployee.setCnp("1563987456214"); // Set Cnp
        newEmployee.setFunction(DidacticFunction.CONFERENTIAR); // Set Didactic Function
        newEmployee.setSalary(3750d); // Set Salary


        // Attempt to add the employee
        boolean result = employeeMock.addEmployee(newEmployee);

        // Assert that the employee was not added successfully
        assertFalse(result);

        // Check if the new employee is in the list
        assertFalse(employeeMock.getEmployeeList().contains(newEmployee));

    }
}

