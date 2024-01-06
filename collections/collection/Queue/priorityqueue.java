package collections.collection.Queue;


import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void queue(){
        // Creation:
        Queue<Integer> pq = new PriorityQueue<>();
        // Addition:
        pq.add(1);
        pq.offer(2);
        pq.add(3);
        pq.offer(4);
        pq.add(5);
        System.out.println(pq);
        // Verifications:
        System.out.println(pq.contains(1));
        // Retrieval:
        System.out.println(pq.peek());
        
        // Removal:
        pq.remove(1);
        System.out.println(pq);

        
        int size = pq.size();
        System.out.println(size);

        // Printing EveryElements:
        for (Integer integer : pq) {
            System.out.println(integer);
        }
    }
    public static void main(String[] args) {
        queue();
    }
   
    
}
