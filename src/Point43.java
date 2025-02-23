public class Point43 {
    class Point2D {
        protected float x = 0.0f;
        protected float y = 0.0f;

        public Point2D() {}

        public Point2D(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float[] getXY() {
            return new float[]{x, y};
        }

        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    class Point3D extends Point2D {
        private float z = 0.0f;

        public Point3D() {}

        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public void setXYZ(float x, float y, float z) {
            setXY(x, y);
            this.z = z;
        }

        public float[] getXYZ() {
            return new float[]{x, y, z};
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + "," + z + ")";
        }
    }

}
