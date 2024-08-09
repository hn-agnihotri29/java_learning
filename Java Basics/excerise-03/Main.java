import java.awt.*;

public class Main {
  
  public static void main(String[] args) {
    
    System.out.println("Hello world!");
    //Car is datatype and myCar is variable
    Car myCar = new Car(25.5,"1BC32E", Color.BLUE, true);

    Car sallyCar = new Car(13.9, "3D2OBN", Color.BLACK, false);

    System.out.println("My Car's License Plate: " + myCar.licensePlate);
    System.out.println("Sally's License Plate: " + sallyCar.licensePlate);
    //In java car is represented in RGB value
    System.out.println(myCar.paint.toString());
    myCar.changePaintColor(Color.RED);
    System.out.println(myCar.paint.toString());

  }
}
