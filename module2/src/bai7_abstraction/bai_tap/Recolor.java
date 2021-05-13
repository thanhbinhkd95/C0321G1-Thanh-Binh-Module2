package bai7_abstraction.bai_tap;

/*Tạo interface Recolor*/
public interface Recolor {
    void howToColor();

    public abstract class Square extends Resize.Shape implements Recolor {
        public Square(double size, String color, boolean filled) {
            super(size, color, filled);
        }

        @Override
        public void howToColor() {
            System.out.println("Color all four sides");
        }
    }

    public static void main(String[] args) {
        Resize.Shape[] shapes = new Resize.Shape[3];
        shapes[0] = new Resize.Circle(4, "red", false);
        shapes[1] = new Resize.Rectangle(3, 7, "black", true);
        shapes[2] = new Square(8, "white", true) {
            @Override
            public void resize(double percent) {

            }
        };

        for (Resize.Shape a : shapes) {
            System.out.println(a);

            if (a instanceof Recolor) {
                Recolor colorable = (Recolor) a;
                colorable.howToColor();
            }
        }
    }
}