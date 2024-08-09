//awt --> abstract window toolkit
import java.awt.*;

public class Car {

  //DataTypes
  //integers -> 1,2,3,
  //Double -> decimal 34.5, 32.6
  //String -> "Hello World" or "a2bc1"

  double averageMilesPerGallon;
  String licensePlate;
  Color paint;
  boolean areTaillightWorking;

  public Car(double inputAverageMPG,
             String inputLicensePlate,
             Color inputPaintColor,
             boolean inputAreTaillightsWorking) {
    this.averageMilesPerGallon = inputAverageMPG;
    this.licensePlate = inputLicensePlate;
    this.paint = inputPaintColor;
    this.areTaillightWorking = inputAreTaillightsWorking;
  }

  public void changePaintColor(Color newPaintColor) {
      this.paint = newPaintColor;
  }
  

  
}
