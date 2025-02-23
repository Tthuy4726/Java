public class Geometric0bject62 {
    interface GeometricObject62 {
        double getArea();
        double getPerimeter();
    }

    class Circle implements GeometricObject62 {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Circle[radius=" + radius + "]";
        }
    }

    class Rectangle implements GeometricObject62 {
        private double width;
        private double length;

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        @Override
        public double getArea() {
            return width * length;
        }

        @Override
        public double getPerimeter() {
            return 2 * (width + length);
        }

        @Override
        public String toString() {
            return "Rectangle[width=" + width + ", length=" + length + "]";
        }
    }

}
