import java.util.Random;

//CarSeat is an add on used by the decorator CarDecorator.
//Each CarSeat adds $25 to the cost of the rental.
public class CarSeat extends CarDecorator{
  private int number;
  //Inheriting from the decorator class.
  //Randomly generates from 1 to 4 CarSeats.
  public CarSeat(Car newCar) {
    super(newCar);
    Random rand = new Random();
    number = rand.nextInt(4) + 1;
  }

  //Adds to the description of the decorator.
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
