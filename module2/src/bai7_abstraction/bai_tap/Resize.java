package bai7_abstraction.bai_tap;

public interface Resize {
    /*tạo interface Resize*/

    void resize(double percent);

    /*Tạo abs class Shape triển khai interface Resize*/

    public abstract class Shape implements Resize {
        private String color = "green";
        private boolean filled = true;


        public Shape() {
        }

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public Shape(double size, String color, boolean filled) {
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        @Override
        public String toString() {
            return "A Shape with color of "
                    + getColor()
                    + " and "
                    + (isFilled() ? "filled" : "not filled");
        }

        public static void printShape(Shape[] shape) {
            for (Shape x : shape) {
                System.out.println(x.toString());
            }
        }
    }
    /*Tạo class Circle kế thừa từ Abs class Shape*/

    public class Circle extends Shape {
        private double radius = 1.0;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        @Override
        public String toString() {
            return "A Circle with radius= "
                    + getRadius()
                    + ", which is a subclass of "
                    + super.toString()
                    + ", Area= " +
                    +getArea();
        }

        @Override
        public void resize(double percent) {
            this.radius *= percent;
        }
    }
    /*Tạo class Rectangle kế thừa từ Abs class Shape*/

    public class Rectangle extends Shape {
        private double width = 1.0;
        private double length = 1.0;

        public Rectangle() {
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea() {
            return width * this.length;
        }

        public double getPerimeter() {
            return 2 * (width + this.length);
        }

        @Override
        public String toString() {
            return "A Rectangle with width = "
                    + getWidth()
                    + " and length = "
                    + getLength()
                    + ", which is a subclass of "
                    + super.toString()
                    + ", Area=" +
                    +getArea();
        }

        @Override
        public void resize(double percent) {
            this.length *= percent;
            this.width *= percent;
        }
    }
    /*Tạo class Square kế thừa từ Abs class Shape*/

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
