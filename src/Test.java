public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 14, 5);
        triangle.printShape();
        System.out.println();
        Rectangle rectangle = new Rectangle(14.5, 2.6);
        rectangle.printShape();
        System.out.println();
        Circle circle = new Circle(25.5);
        circle.printShape();
        System.out.println();
        Parallelogram parallelogram = new Parallelogram(10, 15, 30);
        parallelogram.printShape();
    }
}