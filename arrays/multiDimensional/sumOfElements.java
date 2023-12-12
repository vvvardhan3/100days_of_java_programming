// Sum of elements in an multidimensional array
package arrays.multiDimensional;

public class sumOfElements {
    public static void main(String[] args) {
        int [][] arr = new int[][]{
            {1,8,4},
            {9,7,2},
            {7,6,4}
        };
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);



    }
    
}
