package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TC6_add_Employee {
    private EmployeeMock employeeMock;

    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @Test
    void TC6_addEmployee() {

        Employee newEmployee = new Employee();
        newEmployee.setId(6); // Set ID
        newEmployee.setLastName("Voica"); // Set Last Name
        newEmployee.setFirstName("Paula"); // Set First Name
        newEmployee.setCnp("1478965234129"); // Set Cnp
        newEmployee.setFunction(DidacticFunction.ASISTENT); // Set Didactic Function
        newEmployee.setSalary(1200d); // Set Salary


        // Attempt to add the employee
        boolean result = employeeMock.addEmployee(newEmployee);

        // Assert that the employee was added successfully
        assertTrue(result);

        // Check if the new employee is in the list
        assertTrue(employeeMock.getEmployeeList().contains(newEmployee));

    }
}
