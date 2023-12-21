package accessModifiers;

public class student {
    
    public int rollno = 101;

    /* 'Public' Access Modifiers can be accessed inside a package, 
    Outside a Package and Even in different Project as well */

    /* 'Public' is accessed everywhere*/

    // constructor
    public student(){
        rollno = 102;
    }

    public void printrollno(){
        System.out.println(rollno);
    }


    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.rollno);
    }
}
