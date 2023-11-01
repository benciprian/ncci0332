package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TC1_add_Employee {
    private EmployeeMock employeeMock;

    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @Test
    void TC1_addEmployee() {

        Employee newEmployee = new Employee();
        newEmployee.setId(1); // Set ID
        newEmployee.setLastName("Hadadea"); // Set Last Name
        newEmployee.setFirstName("Andrei"); // Set First Name
        newEmployee.setCnp("1830517823459"); // Set Cnp
        newEmployee.setFunction(DidacticFunction.LECTURER); // Set Didactic Function
        newEmployee.setSalary(2300d); // Set Salary


        // Attempt to add the employee
        boolean result = employeeMock.addEmployee(newEmployee);

        // Assert that the employee was added successfully
        assertTrue(result);

        // Check if the new employee is in the list
        assertTrue(employeeMock.getEmployeeList().contains(newEmployee));

    }
}

