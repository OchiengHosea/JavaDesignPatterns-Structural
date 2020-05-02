/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuraldesignpatterns;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author jp
 */
public class StructuralDesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Getting Strarted with structural design patters");
        
        // examples of adapter pattern arrays to list and streams
        // Adapter connects new code to legacy code withoout breaking legacy code
        EmployeeClient client = new EmployeeClient();
        System.out.println(client.getEmployeeList());
    }
    
}
