import java.util.Random;

public class CarSeat extends CarDecorator{
  private int number;
  public CarSeat(Car newCar) {
    super(newCar);
    Random rand = new Random();
    number = rand.nextInt(4) + 1;

  }

  @Override
  public String getDescription(){
    return decoratedCar.getDescription() + ", " + number + " Car Seat(s)";
  }
  @Override
  public int getCost(){
    return decoratedCar.getCost() + (25 * number);
  }

  public void setCost(int numDays){
    return;
  }

  public String getName(){
    return "";
  }

  public String getType(){
    return "";
  }
}
