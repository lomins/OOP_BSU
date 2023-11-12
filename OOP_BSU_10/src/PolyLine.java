import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
        points.add(point);
    }

    public List<Point> getPoints() {
        return points;
    }
}
