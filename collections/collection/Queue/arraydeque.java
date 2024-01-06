package collections.collection.Queue;

import java.util.ArrayDeque;

public class arraydeque {
    public static void queue(){
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(3);
        ad.add(4);
        ad.add(5);
        System.out.println(ad);

        System.out.print("Enter element at head position: ");
        ad.addFirst(1);
        System.out.println(ad);
        System.out.print("Enter element at Tail position: ");
        ad.addLast(6);
        System.out.println(ad);
        System.out.print("Get the element from head position: ");
        System.out.println(ad.peekFirst());
        System.out.print("Get the element from Tail position: ");
        System.out.println(ad.peekLast());
        System.out.print("Remove & Print the element from head Position: ");
        System.out.println(ad.removeFirst());
        System.out.print("Remove & Print the element from Tail Position: ");
        System.out.println(ad.removeLast());

        for (Integer integer : ad) {
            System.out.println(integer);
        }

        
    }
    public static void main(String[] args) {
        queue();
    }
}
