package collections.collection.list;

import java.util.ArrayList;
import java.util.List;

public class assignment16 {
    
    public static void employeeList(){
        List<employee> employees = new ArrayList<>();
        employees.add(new employee("modi", 101,500000.25,"India"));
        employees.add(new employee("Biden", 102,7500000.31,"USA"));

        //System.out.println(employees);

        for (employee employee : employees) {
            System.out.println(employee);
        }
        
    }
    public static void main(String[] args) {
        employeeList();
    }
    
}
