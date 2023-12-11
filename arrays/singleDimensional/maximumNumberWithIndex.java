// Program to find the maximum number with it's index value.
package arrays.singleDimensional;

public class maximumNumberWithIndex {
    public static void main(String[] args) {
        int[] a = {2,5,1,9,6};
        
        int max = a[0];
        int maxIndex = 0;

        for(var i = 0; i< a.length;i++){
            if (a[i]>max) {
                maxIndex = i;
                max = a[i];
            }
        }
        System.out.println("Maximum value is:"+ max);
        System.out.println("Index Value is: " + maxIndex);

    }
}
