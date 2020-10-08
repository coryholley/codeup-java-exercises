package shapes;

public class Square extends Quadrilateral {
    //INTERFACES AND ABSTRACT CLASSES

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setLength(int side) {
        this.length = side;
    }

    @Override
    public void setWidth(int side) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        System.out.println("For a square perimeter");
        double perimeter = 4 * width;
        return perimeter;
    }

    @Override
    public double getArea() {
        System.out.println("For a square area");
        double area = this.length * this.width;
        return area;
    }


    //INHERITANCE AND POLYMORPHISM

//    public Square(int side) {
//        super(side, side);
//    }
//
//    public int getArea() {
//        System.out.println("For a square area");
//        int area = this.length * this.width;
//        return area;
//    };
//
//    public int getPerimeter() {
//        System.out.println("For a square perimeter");
//        int perimeter = 4 * width;
//        return perimeter;
//    }


}
