package shapes;

public class Square extends Rectangle {
    protected double side;

//    public Square(double length) {
//        super(length, width);
//    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public void setLength(double side) {
        setWidth(side);
    }

//    public void setSide(double side) {
//        this.side = side;
//    }

    public void setWidth(double side) {
        width = side;

        length = side;
        this.side = side;
    }


}
