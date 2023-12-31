package POJOClass;

public class pojoClass {

    /* Class must be Public */

    private int id;
    public String name;
    protected double salary;


    public pojoClass(){
        // System.out.println("This is empty constructor");
    } 

    /* Getters and Setter are Recommended */
    public pojoClass(int id){
        this.id = id;
    }

    public void setID(int id){
        this.id = id;
    }

    public int getID(){
        return id;
    }

    /* It should not implement any interfaces */
    /* It should not extend any classes */
    /* It should not any annotations */


    
}
