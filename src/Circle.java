public class Circle extends GeometricalShape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius can't be negative");
        }
    }

    private double calculateArea() {
        return Math.PI * radius * radius;
    }

    private double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printShape() {
        System.out.println("Radius: " + this.radius);
        super.printShape();
    }
}