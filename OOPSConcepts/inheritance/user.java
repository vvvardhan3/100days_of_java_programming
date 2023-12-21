package OOPSConcepts.inheritance;

public class user {
    // This is multi-level Inheritance.
    /* Implementation of Inheritance with classes 
    only supports multi-level Inheritance */
    public static void main(String[] args) {
        guest guest = new guest();
        guest.read();
        
        developer developer = new developer();
        developer.read();
        developer.write();

        admin admin = new admin();
        admin.read();
        admin.write();
        admin.manage();


    }
}
