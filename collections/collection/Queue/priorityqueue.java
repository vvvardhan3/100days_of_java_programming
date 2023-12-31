package collections.collection.Queue;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void queue(){
        // Creation:
        /* Duplicates 'Yes' 
        Nulls 'No' */
        Queue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> pq1 = new PriorityQueue<>();
        System.out.println("Addition: ");
        pq.add(1);
        pq1.add(1);
        pq.offer(2);
        pq.add(3);
        pq.offer(4);
        pq.add(5);
        System.out.println(pq);
        System.out.println("Verifications: ");
        System.out.println(pq.contains(1));
        System.out.println(pq.containsAll(pq1));

        System.out.println("Retrieval: ");
        System.out.println(pq.peek()); // Returns element
       

        

        System.out.println("Removal: ");
        pq.remove(); // removes element from the queue
        System.out.println(pq);
        

        System.out.println("Printing Every Elements: ");
        for (Integer integer : pq) {
            System.out.println(integer);
        }
        

        // while (!pq.isEmpty()) {
        //     System.out.println(pq.poll());
        // }

        // System.out.println();
        
      

        // size:
        int size = pq.size();
        System.out.println("Size: " + size);

        System.out.println();

    }
     public static void queue1(){
        // Creation:
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.offer(2);
        pq.add(3);
        pq.offer(4);
        pq.add(5);

        for (Integer integer : pq) {
            System.out.println(integer);
        }

     }

    public static void main(String[] args) {
        queue();
        queue1();
    }
   
    
}
