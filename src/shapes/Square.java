package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public int getArea() {
        System.out.println("For a square area");
        int area = this.length * this.width;
        return area;
    };

    public int getPerimeter() {
        System.out.println("For a square perimeter");
        int perimeter = 4 * width;
        return perimeter;
    }
}
