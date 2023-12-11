package arrays.singleDimensional;

public class mergeTwoArrays {
    public static void main(String[] args) {
        String[] a = {"Chai","Coffee"};
        String[] b = {"Milk","Water","Coke"};

        String[] c = new String[a.length + b.length];


        for(int i =0;i < a.length;i++){
            c[i] = a[i];
            System.out.println(c[i]);
        }

        for(int i =0;i < b.length;i++){
            c[i+a.length] = b[i];
            System.out.println(c[i]);
        }
        
    }
    
}
