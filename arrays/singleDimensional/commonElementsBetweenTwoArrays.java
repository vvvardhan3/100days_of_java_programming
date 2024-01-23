public class commonElementsBetweenTwoArrays {
    public static void elements(){
        int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,5};
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    System.out.println(nums1[i]);
                    System.out.println(nums2[j]);
                    count++;
                }
            }

        } System.out.println(count);
    }
    public static void main(String[] args) {
        elements();
    }
}
