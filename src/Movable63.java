public class Movable63 {
    interface Moveable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    class MoveablePoint implements Moveable {
        int x, y, xSpeed, ySpeed;

        public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public void moveUp() {
            y -= ySpeed;
        }

        @Override
        public void moveDown() {
            y += ySpeed;
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
            return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
        }
    }

}
