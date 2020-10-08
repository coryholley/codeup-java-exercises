package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    //INTERFACES AND ABSTRACT CLASSES

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * this.length + 2 * this.width;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = this.length * this.width;
        return area;
    }

    //INHERITANCE AND POLYMORPHISM

//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getPerimeter() {
//        int perimeter = 2 * this.length + 2 * this.width;
//        return perimeter;
//    }
//
//    public int getArea() {
//        int area = this.length * this.width;
//        return area;
//    }


}
