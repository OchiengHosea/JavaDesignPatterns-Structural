/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuraldesignpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jp
 */
public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDB);
        
        // This does not work
        // Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@chewie.com");
        // What do we do?
        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@chewie.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));
        EmployeeCSV employeeFromCSV = new EmployeeCSV("463, Sherlok, Holmes, sherlok@holmes.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }
}
