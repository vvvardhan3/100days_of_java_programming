package arrays.multiDimensional;

public class definingIntialising {
    public static void main(String[] args) {
        String[][] arr = new String[3][2];

        arr[0][0] = "Preethi";
        arr[0][1] = "Katta";
        arr[1][0] = "Vishnu ";
        arr[1][1] = "Vardhan";
        arr[2][0] = "Bhargav ";
        arr[2][1] = "Ram";

        for(int i = 0; i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+  "   ");
            }
            System.out.println();
        }
        
    }
}
