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
public class EmployeeAdapterLdap implements Employee {
    private EmployeeLdap instance;
    
    public EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        this.instance = employeeFromLdap;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getSurname();
    }

    @Override
    public String getLastName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
    
    public String toString() {
        return "ID: " + instance.getCn();
    }
    
}
