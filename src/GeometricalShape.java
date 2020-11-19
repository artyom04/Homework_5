public class GeometricalShape {
    private double perimeter = 0;
    private double area = 0;

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void printShape() {
        System.out.println("Perimeter: " + this.perimeter);
        System.out.println("Area: " + this.area);
    }
}