public class Point {
    private int x;
    private int y;

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setter methods (optional, not used in this example)
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        // Create two Point objects using the constructor
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);

        // Accessing the data members using getter methods
        System.out.println("Point 1: x = " + p1.getX() + ", y = " + p1.getY());
        System.out.println("Point 2: x = " + p2.getX() + ", y = " + p2.getY());
    }
}
