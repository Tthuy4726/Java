public class MOvable64 {
    // Interface Movable
    interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    // Class MovablePoint
    class MovablePoint implements Movable {
        protected int x, y, xSpeed, ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public void moveUp() {
            y += ySpeed;
        }

        @Override
        public void moveDown() {
            y -= ySpeed;
        }

        @Override
        public void moveLeft() {
            x -= xSpeed;
        }

        @Override
        public void moveRight() {
            x += xSpeed;
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
        }
    }

    // Class MovableCircle
    class MovableCircle implements Movable {
        private int radius;
        private MovablePoint center; // Composition

        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            this.center = new MovablePoint(x, y, xSpeed, ySpeed);
            this.radius = radius;
        }

        @Override
        public void moveUp() {
            center.moveUp();
        }

        @Override
        public void moveDown() {
            center.moveDown();
        }

        @Override
        public void moveLeft() {
            center.moveLeft();
        }

        @Override
        public void moveRight() {
            center.moveRight();
        }

        @Override
        public String toString() {
            return center.toString() + ", radius=" + radius;
        }
    }

}
