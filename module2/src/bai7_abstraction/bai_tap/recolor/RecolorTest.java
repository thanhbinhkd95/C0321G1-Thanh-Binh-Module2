package bai7_abstraction.bai_tap.recolor;

import bai7_abstraction.bai_tap.resize.Resize;

public class RecolorTest {
    public static void main(String[] args) {
        Resize.Shape[] shapes = new Resize.Shape[3];
        shapes[0] = new Resize.Shape(4, "red", false);
        shapes[1] = new Resize.Shape(3, 7, "black", true);
        shapes[2] = new Recolor.Square(8, "white", true) {
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
