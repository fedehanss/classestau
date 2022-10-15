public class Rectangle {
    private double width;
    private double length;
    private String colour;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public Rectangle(){
        width = 0;
        length = 0;
        colour = "";
    }
    public Rectangle(double length, double width, String colour){
        this.length = length;
        this.width = width;
        this.colour = colour;
    }
    public double perimeterCalculation(){
        return (width * 2) * (length * 2);
    }
    public double areaCalculation(){
        return width * length;
    }
}
