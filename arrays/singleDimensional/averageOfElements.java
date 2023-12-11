package arrays.singleDimensional;

public class averageOfElements {
    public static void main(String[] args) {
        int[] i = {2,5,1,9,6};
        int sum = 0;
        int avg = 0;
        for(int j = 0; j<i.length;j++){
            sum = sum + i[j];
        }
        avg = sum/i.length;
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + avg);
    }
    
}
