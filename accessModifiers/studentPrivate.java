package accessModifiers;

public class studentPrivate {

    /* 'Private' can only be  accessed inside a class! */
    /* 'Protected' can be accessed inside a class and a sub-class */
    /* 'Default' can be accessed only inside a class and but not in a sub-class */
    
    private int rollno = 101;

    private studentPrivate(){
        rollno = 102;
    } 

    private void printrollno(){
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        studentPrivate sp = new studentPrivate();
        System.out.println(sp.rollno);
        sp.printrollno();

    }





}
