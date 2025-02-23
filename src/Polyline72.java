import java.util.*;
public class Polyline72 {

    class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public double distanceTo(Point other) {
            return Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y));
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    class PolyLine {
        private ArrayList<Point> points;

        public PolyLine() {
            this.points = new ArrayList<>();
        }

        public PolyLine(ArrayList<Point> points) {
            this.points = new ArrayList<>(points);
        }

        public void appendPoint(int x, int y) {
            points.add(new Point(x, y));
        }

        public void appendPoint(Point point) {
            points.add(point);
        }

        public double getLength() {
            double length = 0.0;
            for (int i = 1; i < points.size(); i++) {
                length += points.get(i - 1).distanceTo(points.get(i));
            }
            return length;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            for (Point p : points) {
                sb.append(p.toString());
            }
            sb.append("}");
            return sb.toString();
        }
    }
}
