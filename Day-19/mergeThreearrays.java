// Writing a java program to merge three arrays
import java.util.Arrays;
public class mergeThreearrays {

public static void main(String[] args) {

    int a[] = {1,2,3};
    int b[] = {4,5,6};
    int c[] = {7,8,9};

    int d[] = new int[a.length + b.length + c.length];

    for(int i=0;i<a.length;i++){
        d[i] = a[i];
    }

    for(int i=0;i<b.length;i++){
        d[i + a.length] = b[i];
    }

    for(int i=0;i<c.length;i++){
        d[i+a.length + b.length] = c[i];
    }

    System.out.println(Arrays.toString(d));

}


}
