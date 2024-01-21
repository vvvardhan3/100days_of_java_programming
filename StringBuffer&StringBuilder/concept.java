
public class concept {
    public static void string(){
        System.out.println("String: ");
        System.out.println();
        String s1 = "Vishnu"; // 17
        String s2 = "Vishnu"; // 17 
        System.out.println(s1 == s2); // 17 == 17 --> True

        s1 = s1.concat("Vardhan"); // 20
        /* If we add a value to the string. It will create a new String (with s1 + new value) at different address  */
        System.out.println(s1 == s2); // 20 == 17 --> False

        String s3 = "VishnuVardhan"; // 22
        System.out.println(s1 == s3); // 17 == 22 --> False
        System.out.println();
        System.out.println("StringBuffer&StringBuilder: ");
        System.out.println();
        StringBuffer sb1 = new StringBuffer("Vishnu"); // 15
        StringBuffer sb2 = new StringBuffer("Vishnu"); // 26 
        System.out.println(sb1 == sb2); // 15 == 26 --> false

        sb1 = sb1.append("Vardhan"); // 15
        /* If we add a value to the StringBuffer. It will just update the existing StringBuffer to a new value at same address  */
        System.out.println(sb1 == sb2); // 15 == 26 --> True

        StringBuffer sb3 = new StringBuffer("VishnuVardhan"); // 22
        System.out.println(sb1 == sb3); // 15 == 31 --> False


    }
    public static void main(String[] args) {
        string();
    }
    
}
