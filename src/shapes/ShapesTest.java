package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape =  new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };

        Square myShape2 = new Square() {
            @Override
            public double getPerimeter() {
                return super.getPerimeter();
            }

            @Override
            public double getArea() {
                return super.getArea();
            }
        };

        Rectangle myShape3 = new Rectangle() {
            @Override
            public double getPerimeter() {
                return super.getPerimeter();
            }

            @Override
            public double getArea() {
                return super.getArea();
            }
        }







//        Rectangle box1 = new Rectangle(4, 5);
//
//        System.out.println("The area of the rectangle is: " + box1.getArea());
//
//        System.out.println("The perimeter of the rectangle is: " + box1.getPerimeter());
//
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println("The area of the square is: " + box2.getArea());
//
//        System.out.println("The perimeter of the square is: " + box2.getPerimeter());
    }

}
