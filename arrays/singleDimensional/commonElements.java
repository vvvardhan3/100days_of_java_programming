import java.util.*;

public class commonElements {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {};
        List<Integer> result = new ArrayList<>();
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                }
            }
        }
        
        int count1 = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < set.size(); j++) {
                if (set.contains(nums1[i])) {
                    count1++;
                    break;
                }
            }  
        } result.add(count1);


        int count2 = 0;
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < set.size(); j++) {
                if (set.contains(nums2[i])) {
                    count2++;
                    break;
                }
            }  
        } result.add(count2);

        System.out.println(result);

    }
}
