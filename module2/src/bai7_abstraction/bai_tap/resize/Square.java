package bai7_abstraction.bai_tap.resize;

public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Area = " +
                +getArea();
    }

    double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        this.side *= percent;
    }



    /*Tạo class Main để khời chạy*/

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "yellow", false);
        shapes[1] = new Rectangle(4, 8, "infinity", true);
        shapes[2] = new Square(6, "melinda", true);
        System.out.println("Before increasing in size : \n");
        for (Shape a : shapes) {
            System.out.println(a);
        }

        System.out.println("\nAfter increasing in size :");
        for (Shape a : shapes) {
            a.resize(Math.floor(Math.random() * 100) + 1);
        }
        System.out.println();
        Shape.printShape(shapes);
    }
}
