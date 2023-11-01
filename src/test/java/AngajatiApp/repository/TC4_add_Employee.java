package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TC4_add_Employee {
    private EmployeeMock employeeMock;

    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @Test
    void TC4_addEmployee() {

        Employee newEmployee = new Employee();
        newEmployee.setId(9); // Set ID
        newEmployee.setLastName("Ra"); // Set Last Name
        newEmployee.setFirstName("Em"); // Set First Name
        newEmployee.setCnp("1412365478963"); // Set Cnp
        newEmployee.setFunction(DidacticFunction.LECTURER); // Set Didactic Function
        newEmployee.setSalary(2400d); // Set Salary


        // Attempt to add the employee
        boolean result = employeeMock.addEmployee(newEmployee);

        // Assert that the employee was not added successfully
        assertFalse(result);

        // Check if the new employee is in the list
        assertFalse(employeeMock.getEmployeeList().contains(newEmployee));

    }
}
