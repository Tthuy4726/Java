public class Circle41 {
    class Circle {
        private double radius = 1.0;
        private String color = "red";

        public Circle() {}

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String toString() {
            return "Circle[radius=" + radius + ", color=" + color + "]";
        }
    }

    class Cylinder extends Circle {
        private double height = 1.0;

        public Cylinder() {}

        public Cylinder(double radius) {
            super(radius);
        }

        public Cylinder(double radius, double height) {
            super(radius);
            this.height = height;
        }

        public Cylinder(double radius, double height, String color) {
            super(radius, color);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getVolume() {
            return getArea() * height;
        }

        @Override
        public String toString() {
            return "Cylinder[radius=" + getRadius() + ", color=" + getColor() + ", height=" + height + "]";
        }
    }

}
