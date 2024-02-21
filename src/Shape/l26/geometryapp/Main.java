
// Main.java

package Shape.l26.geometryapp;

import Shape.l26.l27.CirclePrintable;
import Shape.l26.l27.RectanglePrintable;
import Shape.l26.l27.Printable;

public class Main {
    public static void main(String[] args) {
        Printable circlePrintable = new CirclePrintable();
        Printable rectanglePrintable = new RectanglePrintable();

        circlePrintable.print();
        rectanglePrintable.print();
    }
}
