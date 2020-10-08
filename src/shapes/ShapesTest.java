package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        //INTERFACES AND ABSTRACT CLASSES

        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };
        myShape = new Rectangle(4,2);
        System.out.println(myShape.getArea() + "\n" + myShape.getPerimeter());
        myShape = new Square(6);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


        //INHERITANCE AND POLYMORPHISM

//        Rectangle box1 = new Rectangle(5,4);
//        Rectangle box2 = new Square(5);
//
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());




    }
}
