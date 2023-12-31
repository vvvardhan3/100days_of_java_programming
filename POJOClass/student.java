package POJOClass;

import java.io.Serializable;

// Java Beans must implement Serializable
public class student implements Serializable {

    // All the intance Variables must be private
    int id;
    String name;
    double marks;

    // Java Beans must have a No ARGS Constructor
    public student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    
    
}
