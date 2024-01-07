// Reverse first k elements of a queue
package collections.collection.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class asssignmen1 {
    public static void queue(){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        Stack<Integer> stack = new Stack<>();
        
        while (q.size()>0) {
            stack.push(q.remove());
        }

         Queue<Integer> q1 = new LinkedList<>();

        while (stack.size() > 0) {
            q1.add(stack.pop());
        }

        System.out.println(q1);

       
    }
    public static void main(String[] args) {
        queue();
    }
    
}
