// Reverse First k Elements in a queue ( Where k = 3), queue = 1,2,3,4,5
package collections.collection.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class assignment2 {

    public static void queue(){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        Stack<Integer> stack = new Stack<>();

        while (q.size() >= 3) {
            stack.add(q.remove());
        }
        System.out.println(stack);

        while (stack.size() > 0) {
            q.add(stack.pop());
        }
        System.out.println(q);

        Queue<Integer> q1 = new LinkedList<>();

        System.out.println(q.size());

        while (q.size() >= 4) {
            q1.add(q.remove());
        }

        System.out.println(q1);

        q.addAll(q1);
        System.out.println(q); // Output: 3,2,1,4,5
    }
    public static void main(String[] args) {
        queue();
    }
    
}
