package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TC2_Modify_Didactic_Function {
    private EmployeeMock employeeMock;

    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }


    @Test
    void TC2_modifyEmployeeFunction() {
        assertThrows(NullPointerException.class, () ->
                employeeMock.modifyEmployeeFunction(null, DidacticFunction.TEACHER));
    }

}

