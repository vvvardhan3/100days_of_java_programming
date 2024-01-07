// Java Program to search for a phone number using name
package collections.maps;

import java.util.HashMap;
import java.util.Scanner;

public class phoneNumbers {

    HashMap<String,Integer> map = new HashMap<>();
    
    public void addContact(String name, Integer number) {
        map.put(name, number);
    
    }
    
    public void getphoneNumber(String name) {
        if (map.containsKey(name)) {
            Integer a = map.get(name);
            System.out.println("Contact of " +name+" is " + a);
        } else {
            System.out.println("Contact Not found: " + name);
        }
    }
    
    public static void main(String[] args) {
    
        phoneNumbers phoneNumbers = new phoneNumbers();
        HashMap<String,Integer> map = new HashMap<>();
        Scanner s=new Scanner(System.in);
        System.out.println("No.of Entries you want to enter: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("name: ");
            String name = s.next();
            System.out.println("Phonenumber: ");
            Integer phone = s.nextInt();

            phoneNumbers.addContact(name, phone);

        }

        System.out.println("Enter a name to Search: ");
        String searchname = s.next();
        phoneNumbers.getphoneNumber(searchname);
       
        
        
        s.close();
    }

    
    
}
