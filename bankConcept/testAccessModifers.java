package bankConcept;

import accessModifiers.student;

public class testAccessModifers {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.rollno);
        s.printrollno();
    }
}
