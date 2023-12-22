package Interface.Area;

public class cricle implements getArea {

    private double radius;
    
    public cricle(double radius){
        this.radius = radius;
    }

    public double Area() {
       return radius * radius;
    }
}
