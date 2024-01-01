package collections.collection.list;

import java.util.Stack;

public class stack {

    /*
     * LIFO - Last In First Out - Stack
     * Stack is a class in Java, Which implements the list interface and extends the vector class and also represents the LIFO Principle
     * 
     * FIFO - First In First Out - Queue
     */
    public static void main(String[] args) {
        stackMethod();
    }


    public static void stackMethod(){
        // while creating a Stack, we are not supposed to be define the 'size'' of the stack
        Stack<String> books = new Stack<>();

        books.add("Red");
        books.add("Black");
        books.push("White");
        // books.remove(0); // Removing string element using its index value
        // books.set(0, "Blue");
        // System.out.println(books.contains("Blue") );
        // System.out.println(books);
        System.out.println(books);
        System.out.println(books.peek()); // 
        //System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.search("White"));
        System.out.println(books.empty()); // is same as vector.isEmpty();


     }
    
}
