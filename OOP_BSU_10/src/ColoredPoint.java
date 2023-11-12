import java.awt.*;

public class ColoredPoint extends Point {
    private Color color;

    public ColoredPoint(double x, double y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
