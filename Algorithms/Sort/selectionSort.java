import java.util.*;

public class selectionSort {
    public static void selection(){
        int[] nums = {64,25,12,22,11};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length ; i++) {
            int mini = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[mini]) {
                    mini = j;
                }
            }
            int temp = nums[mini]; 
            nums[mini] = nums[i];
            nums[i] = temp;
            list.add(nums[i]);
        }  System.out.println(list);
    }
    public static void main(String[] args) {
        selection();
    }
}

/*
 * Time-Complexity : O(N*N)
 * Space-Complexity : O(1)
 * Works well with smaller datasets
 */
