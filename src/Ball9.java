public class Ball9 {
    private float x, y;
    private int radius;
    private float deltaX, deltaY;

    public Ball9(float x, float y, int radius, float deltaX, float deltaY) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getDeltaX() {
        return deltaX;
    }
    public float getDeltaY() {
        return deltaY;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setDeltaX(float deltaX) {
        this.deltaX = deltaX;
    }
    public void setDeltaY(float deltaY) {
        this.deltaY = deltaY;
    }

    public void move() {
        x += deltaX;
        y += deltaY;
    }

    public void reflectHorizontal() {
        deltaX = -deltaX;
    }

    public void reflectVertical() {
        deltaY = -deltaY;
    }

    // toString method
    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "), speed=(" + deltaX + "," + deltaY + ")]";
    }
}
