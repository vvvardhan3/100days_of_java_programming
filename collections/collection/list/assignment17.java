// Java Program to Print the salary of the employee from a specific country
package collections.collection.list;

import java.util.ArrayList;
import java.util.List;

public class assignment17 {
    public static void employeeList(){
        List<employee> employees = new ArrayList<>();
        employees.add(new employee("modi", 101,500000.25,"India"));
        employees.add(new employee("Biden", 102,7500000.31,"USA"));

        //System.out.println(employees);

        double totalSalary = 0;
        String targetCountry = "India";

        for (employee employee : employees) {
            if (employee.getCountry().equalsIgnoreCase(targetCountry)) {
                 totalSalary = totalSalary + employee.getSalary();
            }
           
        }
        System.out.println("Total Salary: "+totalSalary);
        
    }
    public static void main(String[] args) {
        employeeList();
    }
    
    
}
