package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TC5_add_Employee {
    private EmployeeMock employeeMock;

    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @Test
        void TC5_addEmployee() {

            Employee newEmployee = new Employee();
            newEmployee.setId(3); // Set ID
            newEmployee.setLastName("Voica"); // Set Last Name
            newEmployee.setFirstName("Paula"); // Set First Name
            newEmployee.setCnp("14789652341292"); // Set Cnp
            newEmployee.setFunction(DidacticFunction.ASISTENT); // Set Didactic Function
            newEmployee.setSalary(1200d); // Set Salary


            // Attempt to add the employee
            boolean result = employeeMock.addEmployee(newEmployee);

            // Assert that the employee was not added successfully
            assertFalse(result);

            // Check if the new employee is in the list
            assertFalse(employeeMock.getEmployeeList().contains(newEmployee));

    }
}
