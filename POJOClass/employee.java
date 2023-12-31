package POJOClass;

public class employee {
    public static void main(String[] args) {
        pojoClass pc1 = new pojoClass();
        pc1.setID(101);
        pc1.name = "Vishnu Vardhan";
        pc1.salary = 920000;

        pojoClass pc2 = new pojoClass();
        pc2.setID(102);
        pc2.name = "Bhargav Ram";
        pc2.salary = 2920000;


        pojoClass pc3 = new pojoClass();
        pc3.setID(103);
        pc3.name = "Lalith Kumar";
        pc3.salary = 1020000;

        pojoClass[] Array = new pojoClass[]{pc1,pc2,pc3};


        System.out.println("Length of the Array is: " + Array.length);
        double Total_salaries = 0;
        System.out.println("Given salaries are: ");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i].salary);
            Total_salaries = Total_salaries + Array[i].salary;    
        }
        System.out.println("Total Salary is: " + Total_salaries);


        // System.out.println(Array);

        // System.out.println(pc1.getID());
        // System.out.println(pc1.name);
        // System.out.println(pc2.getID());
        // System.out.println(pc2.salary);
        // System.out.println(pc3.getID());
    }
}
