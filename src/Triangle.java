public class Triangle extends GeometricalShape {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        setSideOne(sideOne);
        setSideTwo(sideTwo);
        setSideThree(sideThree);
        super.setPerimeter(calculatePerimeter());
        super.setArea(calculateArea());
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

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        if (sideThree > 0) {
            this.sideThree = sideThree;
        } else {
            System.out.println("Side can't be negative");
        }
    }

    private double calculatePerimeter() {
        return sideOne + sideTwo + sideThree;
    }

    private double calculateArea() {
        return Math.sqrt(calculatePerimeter() / 2 * (calculatePerimeter() / 2 - sideOne) * (calculatePerimeter()
                / 2 - sideTwo) * (calculatePerimeter() / 2 - sideThree));
    }

    @Override
    public void printShape() {
        System.out.println("Sides: " + this.sideOne + ", " + this.sideTwo + ", " + this.sideThree);
        super.printShape();
    }
}