package accessModifiers;

public class student {
    
    public int rollno = 101;

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
