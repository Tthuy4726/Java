public class Movable68 {
    interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    class MovablePoint implements Movable {
        int x, y, xSpeed, ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public void moveUp() {
            y += ySpeed;
        }

        public void moveDown() {
            y -= ySpeed;
        }

        public void moveLeft() {
            x -= xSpeed;
        }

        public void moveRight() {
            x += xSpeed;
        }

        public String toString() {
            return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
        }
    }

    class MovableCircle implements Movable {
        private int radius;
        private MovablePoint center;

        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            this.radius = radius;
            this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        }

        public void moveUp() {
            center.moveUp();
        }

        public void moveDown() {
            center.moveDown();
        }

        public void moveLeft() {
            center.moveLeft();
        }

        public void moveRight() {
            center.moveRight();
        }

        public String toString() {
            return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
        }
    }
}
