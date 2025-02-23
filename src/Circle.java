
public class Circle {

    private double radius;
    private String color;


    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return "Circle[radius=" + this.radius + ", color=" + this.color + "]";
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("Hình tròn có bán kính: "
                + c1.getRadius() + " và diện tích: " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Hình tròn có bán kính: "
                + c2.getRadius() + " và diện tích: " + c2.getArea());

        Circle c3 = new Circle(3.0, "blue");
        System.out.println("Hình tròn có bán kính: "
                + c3.getRadius() + ", màu sắc: " + c3.getColor()
                + " và diện tích: " + c3.getArea());

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        c4.setColor("green");
        System.out.println("Bán kính mới: " + c4.getRadius());
        System.out.println("Màu sắc mới: " + c4.getColor());

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());
        System.out.println(c5);
        System.out.println("Toán tử '+' cũng gọi toString(): " + c5);
    }
}
