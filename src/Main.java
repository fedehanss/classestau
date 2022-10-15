public class Main {

    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        Rectangle room2 = new Rectangle(15, 25, "Green");

        room1.setLength(10);                       //Setting length
        room1.setWidth(20);                        //Setting width

        System.out.println("Room1 area is: " + room1.areaCalculation());
        System.out.println("Room1 perimeter is: " + room1.perimeterCalculation());
        System.out.println("Room2 area is: " + room2.areaCalculation());
        System.out.println("Room2 perimeter is: " + room2.perimeterCalculation());
        System.out.println("Combined areas of room1 and room2 is: " + sumAreas(room1, room2));
        System.out.println("Combined perimeters of room1 and room2 is: " + sumPerimeters(room1, room2));

     }
     public static double sumAreas(Rectangle a, Rectangle b){
        return a.areaCalculation() + b.areaCalculation();
     }
    public static double sumPerimeters(Rectangle a, Rectangle b){
        return a.perimeterCalculation() + b.perimeterCalculation();
    }

}
