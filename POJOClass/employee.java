package POJOClass;

public class employee {
    public static void main(String[] args) {
        pojoClass pc = new pojoClass();
        pc.setID(101);
        pc.name = "Vishnu Vardhan";
        pc.salary = 920000;

        System.out.println(pc);
        System.out.print(pc.getID());
        System.out.println(pc.name);
    }
}
