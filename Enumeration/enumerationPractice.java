package Enumeration;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;

public class enumerationPractice{
    public static void stackEnumeration(){
        /*
         *  It is a Interface
         *  Introduced for iterating the lagacy collection objects (Classes that are introduced in Verison  1.0)
         *  Those are HashTable, Stack, Vector, Dictionary and Properties
         *  Hence, Enumeration is a Legacy Interface!
         *  One-Direction and Read-Only Operation
         */

        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);

        System.out.println( "Elements in Stack: "+ st);

        Enumeration<Integer> e = st.elements();

        System.out.println("Using Enumeration: ");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

    public static void HashTableEnumeration(){

        System.out.println(" ");
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        ht.put(1, 1);
        ht.put(2, 1);
        ht.put(3, 1);
        ht.put(4, 1);
        ht.put(5, 1);
        ht.put(6, 1);

        System.out.println("Elements in HashTable: " + ht);

        Enumeration<Integer> e = ht.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

    public static void main(String[] args) {
        stackEnumeration();
        HashTableEnumeration();
    }
    
}