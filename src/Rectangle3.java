public class Rectangle3 {
    private float Lenghth;
    private float Width;

    public Rectangle3(float lenghth, float width) {
        this.Lenghth = lenghth;
        this.Width = width;
    }

    public float getLenghth () {
       return this.Lenghth;
    }

    public void setLenghth (float lenghth) {
        this.Lenghth = Lenghth;
    }

    public float getWidth () {
        return this.Width;
    }

    public void setWidth (float width) {
        this.Width = Width;
    }

    public double getArea() {
        return this.Lenghth * this.Width;
    }

    public double getPerimeter (){
        return 2 * (this.Lenghth + this.Width);
    }

    @Override
    public String toString() {
        return "Rectangle3 [lenghth=" + Lenghth + ", Width=" + Width + "]";
    }
}
