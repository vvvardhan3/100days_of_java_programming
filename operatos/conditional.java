package operatos;

public class conditional {
    public static void main(String[] args) {
        // && --> CONDITIONAL AND
        /* It should return only true, if both the expressions are true, else return false */
        // || --> CONDITIONAL OR
        /* It should return only true, it any of the expression is true, else return false */
        int i = 20;
        int j = 15;

        System.out.println(i < j /* false */  && i == j /* false */); // --> False
        System.out.println(i < j /* false */  && i > j /* true */); // --> False
        System.out.println(i > j /* true */  && i < j /* false */); // --> False
        System.out.println(i != j /* true */  && i > j /* true */); // --> True

        System.out.println(" ");

        System.out.println(i < j /* false */  || i == j /* false */); // --> False
        System.out.println(i < j /* false */  || i > j /* true */); // --> True
        System.out.println(i > j /* true */  || i < j /* false */); // --> True
        System.out.println(i != j /* true */  || i > j /* true */); // --> True
        
         
    }




    
}
