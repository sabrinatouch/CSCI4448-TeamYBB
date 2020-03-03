import java.util.ArrayList;

public abstract class Customer{
  protected String name;
  private String type;

  public Customer(String name, String type){
    this.name = name;
    this.type = type;
  }

  public abstract String getName();
  public abstract int getNumCars();
  public abstract void generateDays();
  public abstract void generateNumCars();
  public abstract int getDays();
  public abstract void decrement();
  public abstract void makeRental(int number);
  public abstract int getCapacity();
  public abstract void setCapacity(int number);
  public abstract void resetCapacity();
  public abstract void addList(Car car);
  public abstract void resetList();
  public abstract ArrayList<Car> getCarList();
  public abstract void resetDays();

}
