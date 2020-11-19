public class Rectangle extends GeometricalShape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height can't be negative");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width can't be negative");
        }
    }

    private double calculatePerimeter() {
        return 2 * (this.height + this.width);
    }

    private double calculateArea() {
        return this.height * this.width;
    }

    @Override
    public void printShape() {
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        super.printShape();
    }
}