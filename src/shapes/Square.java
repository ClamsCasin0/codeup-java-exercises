package shapes;

public class Square extends Quadrilateral {

    public Square(double length) {
        super(length, length);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    ////    protected double side;
//
////    public Square(double length) {
////        super(length, width);
////    }
//
//    public Square(double side) {
//        super(side, side);
//        this.length = side;
//    }
//
//    public double getArea() {
//        return Math.pow(length, 2);
//    }
//
//    public double getPerimeter() {
//        return 4 * length;
//    }
//
//    public void setLength(double side) {
//        setWidth(side);
//    }
//
////    public void setSide(double side) {
////        this.side = side;
////    }
//
//    public void setWidth(double side) {
//        width = side;
//        length = side;
//        this.length = side;
//    }


}
