package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TC2_add_Employee {
    private EmployeeMock employeeMock;

    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @Test
    void TC2_addEmployee() {

        Employee newEmployee = new Employee();
        newEmployee.setId(4); // Set ID
        newEmployee.setLastName("Ruje"); // Set Last Name
        newEmployee.setFirstName("Paul"); // Set First Name
        newEmployee.setCnp("1457864123698"); // Set Cnp
        newEmployee.setFunction(DidacticFunction.TEACHER); // Set Didactic Function
        newEmployee.setSalary(-1950d); // Set Salary


        // Attempt to add the employee
        boolean result = employeeMock.addEmployee(newEmployee);

        // Assert that the employee was mot added successfully
        assertFalse(result);

        // Check if the new employee is in the list
        assertFalse(employeeMock.getEmployeeList().contains(newEmployee));

    }
}

