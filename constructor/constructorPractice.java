package constructor;
// Constructors are used in memory allocation for the variables and methords during the object creation.

public class constructorPractice {
    public int i;
    public static void main(String[] args) {
        constructorPractice cP = new constructorPractice();
        System.out.println(cP.i);
    }
    // Parameterless Constructor
    public constructorPractice (){
        i = 20;
        System.out.println("This is a parameterless constructor");
    }
    // Parameterized Constructor
    public constructorPractice(int a){
        i = a;
        System.out.println("This is a parameterized constructor");
    }
}
