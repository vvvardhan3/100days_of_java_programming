package arrays.singleDimensional;

public class arrayReverse {
    public static void main(String[] args) {
        Boolean[] a = new Boolean[6];

        a[0] = true;
        a[1] = false;
        a[2] = false;
        a[3] = true;
        a[4] = false;
        a[5] = true;

        for(int i = a.length-1; i>=0;i--){
            System.out.print(a[i]+ " ");
            
        }
    }
}
