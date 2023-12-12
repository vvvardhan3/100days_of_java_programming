// Comparing two arrays If we have same element at a given index, then we return 1, if not 0.
package arrays.multiDimensional;

public class compareArrays {
    public static void main(String[] args) {
        int[][] arr1 = new int[][] {
            {1, 8, 4},
            {9, 7, 2},
            {7, 6, 4}
        };
        int[][] arr2 = new int[][] {
            {1, 9, 4},
            {2, 7, 3},
            {7, 2, 4}
        };

        int[][] array = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] == arr2[i][j]) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }
    }
}
