class MyPoint {
    private int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public int[] getXY() { return new int[]{x, y}; }
    public void setXY(int x, int y) { this.x = x; this.y = y; }

    public double distance(MyPoint another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class MyLine {
    private MyPoint begin, end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() { return begin; }
    public void setBegin(MyPoint begin) { this.begin = begin; }
    public MyPoint getEnd() { return end; }
    public void setEnd(MyPoint end) { this.end = end; }

    public int getBeginX() { return begin.getX(); }
    public void setBeginX(int x) { begin.setX(x); }
    public int getBeginY() { return begin.getY(); }
    public void setBeginY(int y) { begin.setY(y); }

    public int getEndX() { return end.getX(); }
    public void setEndX(int x) { end.setX(x); }
    public int getEndY() { return end.getY(); }
    public void setEndY(int y) { end.setY(y); }

    public int getLength() {
        return (int) begin.distance(end);
    }

    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
