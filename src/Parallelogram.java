public class Parallelogram extends GeometricalShape {
    private double sideOne;
    private double sideTwo;
    private double angleBetweenSides;

    public Parallelogram(double sideOne, double sideTwo, double angleBetweenSides) {
        setSideOne(sideOne);
        setSideTwo(sideTwo);
        setAngleBetweenSides(angleBetweenSides);
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        if (sideOne > 0) {
            this.sideOne = sideOne;
        } else {
            System.out.println("Side can't be negative");
        }
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        if (sideTwo > 0) {
            this.sideTwo = sideTwo;
        } else {
            System.out.println("Side can't be negative");
        }
    }

    public double getAngleBetweenSides() {
        return angleBetweenSides;
    }

    public void setAngleBetweenSides(double angleBetweenSides) {
        if (angleBetweenSides != 0) {
            this.angleBetweenSides = angleBetweenSides;
        } else {
            System.out.println("Angle between sides can't be negative");
        }
    }

    public double calculatePerimeter() {
        return 2 * (sideOne + sideTwo);
    }

    public double calculateArea() {
        return sideOne * sideTwo * Math.sin(Math.toRadians(angleBetweenSides));
    }

    @Override
    public void printShape() {
        System.out.println("Sides: " + this.sideOne + ", " + this.sideTwo);
        System.out.println("Angle between sides: " + this.angleBetweenSides);
        super.printShape();
    }
}