package bai7_abstraction.bai_tap.recolor;

import bai7_abstraction.bai_tap.resize.Resize;

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

        public abstract void resize(double percent);
    }

}