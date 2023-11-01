package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TC1_Modify_Didactic_Function {
    private EmployeeMock employeeMock;

    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @Test
    void TC1_modifyEmployeeFunction() {
        // Create an employee to modify (Dodel Pacuraru)
        Employee employeeToModify = new Employee(4,"Dodel", "Pacuraru", "1234567890876", DidacticFunction.ASISTENT, 2500d);

        // Set the expected new function
        DidacticFunction newFunction = DidacticFunction.LECTURER;

        // Modify the employee's function
        employeeMock.modifyEmployeeFunction(employeeToModify, newFunction);

        // Retrieve the modified employee
        Employee modifiedEmployee = employeeMock.getEmployeeList()
                .stream()
                .filter(e -> e.getId() == employeeToModify.getId())
                .findFirst()
                .orElse(null);

        // Check if the employee's function has been changed
        assertNotNull(modifiedEmployee);
        assertEquals(newFunction, modifiedEmployee.getFunction());
    }
}
