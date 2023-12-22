package Interface.Area;

public class rectangle implements getArea{

    // Defining a varibles
    private double width;
    private double length;

    // Using Constructor and Initializing the values

    public rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    // Interface
    public double Area() {
        return width * length;
    }


    
}
