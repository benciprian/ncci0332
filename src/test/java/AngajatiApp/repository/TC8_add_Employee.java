package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TC8_add_Employee {
    private EmployeeMock employeeMock;

    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @Test
    void TC8_addEmployee() {

        Employee newEmployee = new Employee();
        newEmployee.setId(3); // Set ID
        newEmployee.setLastName("Chise"); // Set Last Name
        newEmployee.setFirstName("Cosmin"); // Set First Name
        newEmployee.setCnp("1784562387412"); // Set Cnp
        newEmployee.setFunction(DidacticFunction.ASISTENT); // Set Didactic Function
        newEmployee.setSalary(1500d); // Set Salary


        // Attempt to add the employee
        boolean result = employeeMock.addEmployee(newEmployee);

        // Assert that the employee was added successfully
        assertTrue(result);

        // Check if the new employee is in the list
        assertTrue(employeeMock.getEmployeeList().contains(newEmployee));

    }
}

