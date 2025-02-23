public class Ball37 {
class Ball {
    private float x, y, z;

    // Constructor
    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public float getX() { return x; }
    public float getY() { return y; }
    public float getZ() { return z; }

    // Setters
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
    class Player {
        private int number;
        private float x, y, z = 0.0f;

        public Player(int number, float x, float y) {
            this.number = number;
            this.x = x;
            this.y = y;
        }

        public void move(float xDisp, float yDisp) {
            this.x += xDisp;
            this.y += yDisp;
        }

        public void jump(float zDisp) {
            this.z += zDisp;
        }

        public boolean near(Ball ball) {
            float dx = this.x - ball.getX();
            float dy = this.y - ball.getY();
            float dz = this.z - ball.getZ();
            double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
            return distance < 8;
        }

        public void kick(Ball ball) {
            if (near(ball)) {
                System.out.println("Player " + number + " kicks the ball!");
                ball.setXYZ(ball.getX() + 5, ball.getY() + 5, ball.getZ() + 2); // Đá bóng đi xa 1 khoảng
            } else {
                System.out.println("Player " + number + " is too far from the ball to kick!");
            }
        }

        @Override
        public String toString() {
            return "Player " + number + " at (" + x + ", " + y + ", " + z + ")";
        }
    }


}
