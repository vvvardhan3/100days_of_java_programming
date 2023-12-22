package Interface.Area;

public class triangle implements getArea {

    private double base;
    private double heigth;

    public triangle(double base,double heigth){
        this.base = base;
        this.heigth = heigth;
    }

    
    public double Area() {
        return 0.5 * base * heigth;
    }
    
    
}
