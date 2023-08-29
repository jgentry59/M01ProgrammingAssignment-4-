public class RegularPolygon {

    private double x = 0;
    private double y = 0;
    private double side = 1;
    private int n = 3;

    public RegularPolygon() {}
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }
    public RegularPolygon(int n, double side, double x, double y) {
        this(n, side);
        this.x = x;
        this.y = y;
    }
    public double getPerimeter() {
        return n * side;
    }
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    private static void displayPolygonInfo(RegularPolygon polygon) {
        System.out.println("Perimeter: " + polygon.getPerimeter());
        System.out.println("Area: " + polygon.getArea());
        System.out.println();
    }
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        displayPolygonInfo(polygon1);
        displayPolygonInfo(polygon2);
        displayPolygonInfo(polygon3);
    }
}