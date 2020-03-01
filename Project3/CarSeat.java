import java.util.Random;

public class CarSeat extends CarDecorator{

  public CarSeat(Car newCar) {
    super(newCar);
    int number = rand.nextInt(4) + 1
    System.out.println("Adding " + number + " Car Seat(s)");
  }

  public String getDescription(){
    return decoratedCar.getDescription() + ", " + number + " Car Seat(s)";
  }

  public int getCost(){
    return decoratedCar.getCost() + (25 * number);
  }
}
