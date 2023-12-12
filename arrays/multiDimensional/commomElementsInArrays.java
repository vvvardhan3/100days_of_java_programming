package arrays.multiDimensional;

public class commomElementsInArrays {
    public static void main(String[] args) {
        int [][] arr1 = new int[][]{
            {1,2,1},
            {9,7,2},
            {7,6,4}
        };
        int [][] arr2 = new int[][]{
            {2,6,8,6},
            {0,1,3,9,7},
            {7,2,0},
            {8,3}
        };

        int elements = 0;

        for(int i = 0; i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                elements = arr1[i][j];
                for(int k =0; k<arr2.length;k++){
                    for(int l = 0;l<arr2[k].length;l++){
                        if (elements == arr2[k][l]) {
                            System.out.print(elements+ " ");
                            
                        }
                    }
                }
            }
        }

    }
}
