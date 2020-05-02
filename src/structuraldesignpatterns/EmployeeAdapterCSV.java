/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuraldesignpatterns;

/**
 *
 * @author jp
 */
public class EmployeeAdapterCSV implements Employee {
    
    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {
        this.instance = employeeFromCSV;
    }

    @Override
    public String getId() {
        return Integer.toString(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
    
}
