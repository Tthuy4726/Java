
    class MyPoint2 {
        private int x, y;

        public MyPoint2(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int[] getXY() {
            return new int[]{x, y};
        }

        public void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double distance(MyPoint2 another) {
            int dx = this.x - another.x;
            int dy = this.y - another.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    class MyCircle {
        private MyPoint center;
        private int radius;

        public MyCircle(int x, int y, int radius) {
            this.center = new MyPoint(x, y);
            this.radius = radius;
        }

        public MyCircle(MyPoint center, int radius) {
            this.center = center;
            this.radius = radius;
        }

        public MyPoint getCenter() {
            return center;
        }

        public void setCenter(MyPoint center) {
            this.center = center;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getCenterX() {
            return center.getX();
        }

        public void setCenterX(int x) {
            center.setX(x);
        }

        public int getCenterY() {
            return center.getY();
        }

        public void setCenterY(int y) {
            center.setY(y);
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        public double distance(MyCircle another) {
            return center.distance(another.center);
        }

        @Override
        public String toString() {
            return "MyCircle[center=" + center + ", radius=" + radius + "]";
        }

}
