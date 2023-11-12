import java.awt.*;

public class ColoredLine extends Line {
    private Color color;

    public ColoredLine(Point startPoint, Point endPoint, Color color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}