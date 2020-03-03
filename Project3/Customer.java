import java.util.ArrayList;

//Customer is an abstract class where the methods are defined and are
//implemented in the respective subclasses by their needs.
public abstract class Customer{
  //Protected field here for subclasses to access the names.
  protected String name;
  private String type;

  //Constructor with given name and type.
  public Customer(String name, String type){
    this.name = name;
    this.type = type;
  }

  //Returns name of Customer.
  public abstract String getName();
  //Generates a number of days a customer can rent out for.
  public abstract void generateDays();
  //Generates a number of cars a customer can rent out.
  public abstract void generateNumCars();
  //Returns the number of days a customer can rent out for.
  public abstract int getDays();
  //Returns the number of cars a customer can rent out.
  public abstract int getNumCars();
  //Decrease the number of days by a day.
  public abstract void decrement();
  //Returns the limit of cars on a given customer.
  public abstract int getCapacity();
  //Increases the capacity of a given customer by 1.
  public abstract void setCapacity(int number);
  //Resets the capacity of a given customer.
  public abstract void resetCapacity();
  //Add a car to the list of rentals by a given customer.
  public abstract void addList(Car car);
  //Clears the entries of car rentals by a given customer.
  public abstract void resetList();
  //Returns the list of car rentals of the customer.
  public abstract ArrayList<Car> getCarList();
  //Resets the number of days the customer rents out.
  public abstract void resetDays();

}
