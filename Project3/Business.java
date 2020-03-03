import java.util.ArrayList;

//Business customer rents three cars for seven days.
public class Business extends Customer {
  //Original_days is used for the defaulted days of rental.
  //We used this to reset the number of days for rental after
  //the customer has returned their rentals.
  private int original_days;
  private int days;
  private int num_cars;
  private int capacity = 0;
  private ArrayList<Car> carList = new ArrayList<Car>();

  //Inheriting name and type parameters from Customer class.
  public Business(String name, String type){
    super(name, type);
  }

  @Override
  public int getNumCars(){
    return this.num_cars;
  }

  @Override
  public String getName(){
    return name;
  }

  //Rents three cars.
  @Override
  public void generateNumCars(){
    this.num_cars = 3;
  }

  //Rents for seven nights.
  @Override
  public void generateDays(){
    this.days = 7;
    this.original_days = 7;
  }

  @Override
  public int getDays(){
    return this.days;
  }

  @Override
  public void decrement(){
    this.days = this.days - 1;
  }

  @Override
  public int getCapacity(){
    return this.capacity;
  }

  @Override
  public void setCapacity(int number){
    this.capacity += number;
  }

  @Override
  public void resetCapacity(){
    this.capacity = 0;
  }

  @Override
  public void addList(Car car){
    this.carList.add(car);
  }

  @Override
  public void resetList(){
    this.carList.clear();
  }

  @Override
  public ArrayList<Car> getCarList(){
    return this.carList;
  }

  @Override
  public void resetDays(){
    this.days = this.original_days;
  }

}
