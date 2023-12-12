// Creating an array with squares of given multi-dimensional array
package arrays.multiDimensional;

public class creatingArraySquares {
    public static void main(String[] args) {
        int [][] arr = new int[][]{
            {1,8,4},
            {9,7,2},
            {7,6,4}
        };
        int[][] squares = new int[3][3];

        for(int i =0;i<arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                squares[i][j] = arr[i][j]*arr[i][j];
                System.out.print(squares[i][j]+" ");
            }
            System.out.println();
        }
    }
}
