// Printing a transpose of array based on the index values
package arrays.multiDimensional;

public class transposingIndex {
    public static void main(String[] args) {
        int[][] arr1 = new int[][] {
            {1, 8, 4},
            {9, 7, 2},
            {7, 6, 4}
        };

        int[][] array = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                array[i][j] = arr1[j][i];
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
