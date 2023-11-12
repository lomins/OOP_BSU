import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ColoredPoint coloredPoint = new ColoredPoint(2.0, 3.0, Color.RED);
        ColoredLine coloredLine = new ColoredLine(coloredPoint, new ColoredPoint(5.0, 6.0, Color.BLUE), Color.GREEN);

        PolyLine polyLine = new PolyLine();
        polyLine.addPoint(coloredPoint);
        polyLine.addPoint(new ColoredPoint(4.0, 5.0, Color.YELLOW));

        Picture picture = new Picture();
        picture.addObject(coloredPoint);
        picture.addObject(coloredLine);
        picture.addObject(polyLine);
    }
}