package OOPSConcepts.inheritance;

import accessModifiers.student;

public class test1AccessModifiers extends student {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.rollno);
        s.printrollno();
    }
}
