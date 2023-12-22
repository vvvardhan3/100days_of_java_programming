package Interface.loptop;

public interface loptop {
    public void read();

    public void write();

    public void copy();

    public void paste();

    public void cut(); 

    /* Interfaces consists of Rules and Regualutions Until Java- 1.7 */
    /* From Java- 1.8, Interfaces consists of Both Rules, Regulations and Implementation of code */

    default void security(){
        audio();
        System.out.println("Please Implement: ");
    }

    static void input(){
        audio();
        System.out.println("Hello World");
    }

    /* From Java- 1.9 */

    private static void audio(){ /* 'Private' is introduced to implement code resuablity inside a interface */
        System.out.println("Hello Singer");
    }

    
} 
