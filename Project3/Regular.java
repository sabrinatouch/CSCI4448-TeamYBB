import java.util.Random;
import java.util.ArrayList;

//Regular customer rents one to three cars for
//three to five nights.
public class Regular extends Customer {
  //Original_days is used for the defaulted days of rental.
  //We used this to reset the number of days for rental after
  //the customer has returned their rentals.
  private int original_days;
  private int days;
  private int num_cars;
  private int capacity = 0;
  private ArrayList<Car> carList = new ArrayList<Car>();

  //Regular customer inherits name and type parameters from Customer class.
  public Regular(String name, String type){
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

  @Override
  public void generateNumCars(){
    Random rand = new Random();
    int random_number = rand.nextInt(3) + 1;
    this.num_cars = random_number;
  }

  @Override
  public void generateDays(){
    Random rand = new Random();
    int random_number = rand.nextInt(3) + 3;
    this.days = random_number;
    this.original_days = random_number;
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
