//We designed the Car to be an interface for flexibility as we instantiate
//different types of cars.
public interface Car {
  //Returns the name of the car.
  public String getName();
  //Returns the type of the car.
  public String getType();
  //Returns the name and the type of the car.
  public String getDescription();
  //Returns the nightly cost of the car.
  public int getCost();
  //Once we know how many nights the customer is renting for,
  //We set the cost to nightly cost * number of days.
  public void setCost(int numDays);
}
