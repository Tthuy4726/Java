public class Shape45 {
    class Shape {
        protected String color;
        protected boolean filled;

        public Shape() {
            this.color = "red";
            this.filled = true;
        }

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public double getArea() {
            return 0;
        }

        public double getPerimeter() {
            return 0;
        }

        @Override
        public String toString() {
            return "Shape[color=" + color + ", filled=" + filled + "]";
        }
    }

    class Circle extends Shape {
        protected double radius;

        public Circle() {
            this.radius = 1.0;
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
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
            return "Circle[" + super.toString() + ", radius=" + radius + "]";
        }
    }

    class Rectangle extends Shape {
        protected double width;
        protected double length;

        public Rectangle() {
            this.width = 1.0;
            this.length = 1.0;
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
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
            return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
        }
    }

    class Square extends Rectangle {
        public Square() {
            super(1.0, 1.0);
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }

        public double getSide() {
            return width;
        }

        public void setSide(double side) {
            this.width = this.length = side;
        }

        @Override
        public void setWidth(double side) {
            this.width = this.length = side;
        }

        @Override
        public void setLength(double side) {
            this.width = this.length = side;
        }

        @Override
        public String toString() {
            return "Square[" + super.toString() + "]";
        }
    }

}
