public class Square extends Shape{

    public double length;
    public double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }




}
