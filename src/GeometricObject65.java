public class GeometricObject65 {
    public interface GeometricObject {
        double getPerimeter();
        double getArea();
    }

    public interface Resizable {
        void resize(int percent);
    }

    public class Circle implements GeometricObject {
        protected double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String toString() {
            return "Circle[radius=" + radius + "]";
        }
    }

    public class ResizableCircle extends Circle implements Resizable {
        public ResizableCircle(double radius) {
            super(radius);
        }

        @Override
        public void resize(int percent) {
            radius *= percent / 100.0;
        }

        @Override
        public String toString() {
            return "ResizableCircle[" + super.toString() + "]";
        }
    }
}