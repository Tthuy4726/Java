public class Circle52 {
     class Circle {
        private double radius;
        private String color;

        public Circle() {
            this.radius = 1.0;
            this.color = "red";
        }

        // Constructor có tham số
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

     class Cylinder {
        private Circle base;  // Một hình trụ có một đáy là hình tròn
        private double height;

        public Cylinder() {
            this.base = new Circle();  // Gọi constructor của Circle
            this.height = 1.0;
        }

        public Cylinder(double radius, String color, double height) {
            this.base = new Circle(radius, color);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public Circle getBase() {
            return base;
        }

        public void setBase(Circle base) {
            this.base = base;
        }

        public double getVolume() {
            return base.getArea() * height;
        }

        @Override
        public String toString() {
            return "Cylinder[base=" + base + ", height=" + height + "]";
        }
    }

}
