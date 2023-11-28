// Writing a java program to find the missing number in an array

public class missingNumber {
    public static void main(String[] args) {
        
        int a[] = {11,12,14,15,16,17,18,19,20};

        // There should be no duplicates
        // Elements should be in range
        // No need to be sorted



        // Solution
        //Sum of the Range of array - Sum of the elements inside the array!

        int sumOfTheElements =0;

        for(int i =0;i<a.length;i++){
            sumOfTheElements = sumOfTheElements + a[i];
        }
        // System.out.println("Sum of the elements inside the array is: " + sumOfTheElements);

        int SumOfTheRange = 0;

        for(int i =a[0];i<=a[a.length-1];i++){
            SumOfTheRange = SumOfTheRange + i;
        }
        // System.out.println("Sum of the elements inside the array is: " + SumOfTheRange);

        int missingNumber = SumOfTheRange - sumOfTheElements;

        System.out.println("The missing number in the array is: " + missingNumber);
    }
}
