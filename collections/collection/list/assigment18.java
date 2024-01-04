//Java program to print the employee names grouped by country
package collections.collection.list;

import java.util.ArrayList;
import java.util.List;

public class assigment18 {
     public static void employeeList(){
        List<employee> employees = new ArrayList<>();
        employees.add(new employee("Vishnu", 101,500000.25,"India"));
        employees.add(new employee("Bhargav", 102,7500000.31,"USA"));
        employees.add(new employee("Preethi", 103,7500000.31,"India"));
        employees.add(new employee("Bandi", 104,7500000.31,"USA"));

        

        
        String target1Country = "India";
        System.out.println(target1Country +": ");
        for (employee employee : employees) {
            if (employee.getCountry().equalsIgnoreCase(target1Country)) {
                System.out.println("- "+ employee.name);
            }
           
        }

        String target2Country = "USA";
        System.out.println(target2Country +": ");
        for (employee employee : employees) {
            if (employee.getCountry().equalsIgnoreCase(target2Country)) {
                System.out.println("- "+ employee.name);
            }
           
        }
        
        
    }
    public static void main(String[] args) {
        employeeList();
    }
    
}
