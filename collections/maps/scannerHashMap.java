package collections.maps;

import java.util.HashMap;
import java.util.Scanner;

public class scannerHashMap {
    public static void scannerinput(){
        HashMap<String,Integer> map = new HashMap<>();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no.of entries you need: ");
        int n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Key: ");
            String a = obj.next();
            System.out.println("Value: ");
            Integer b = obj.nextInt();
            map.put(a, b);
        }
        System.out.println(map);

        obj.close();
    }
    public static void main(String[] args) {
        scannerinput();
    }
}
