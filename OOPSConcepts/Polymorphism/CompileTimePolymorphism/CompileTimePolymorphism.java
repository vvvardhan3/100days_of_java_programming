package OOPSConcepts.Polymorphism.CompileTimePolymorphism;

public class CompileTimePolymorphism {
    public void add(int a, int b){ // Method- Overloading 
        /* Overloading is based on Type of the variable */
        System.out.println( a + b);
    }

    public void add(int a, int b, int c){ // Number of parameters are different
        System.out.println( a + b + c);
    }

    public void add(double a, double b){ // Type of parameters are different
        System.out.println( a + b);
    }

    public void add( int a, double b){ // Order of the parameters are different
        System.out.println( a + b);
    }

    public static void main(String[] args) {
        CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
        compileTimePolymorphism.add(1, 2);
        compileTimePolymorphism.add(1, 2, 3);
        compileTimePolymorphism.add(1.2, 2.2);
        compileTimePolymorphism.add(1, 2.2);

        
    }



}
