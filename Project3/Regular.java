import java.util.Random;
import java.util.ArrayList;

public class Regular extends Customer {
  private int days;
  private int capacity = 0;
  private ArrayList<Object> carList = new ArrayList <>();

  public Regular(String name, String type){
    super(name, type);
  }

  @Override
  public int getNumCars(){
    Random rand = new Random();
    int random_number = rand.nextInt(3) + 1;
    return random_number;
  }

  @Override
  public String getName(){
    return name;
  }

  @Override
  public void generateDays(){
    Random rand = new Random();
    int random_number = rand.nextInt(3) + 3;
    this.days = random_number;
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
  public void makeRental(int number){
    this.capacity += number;
  }

  @Override
  public int getCapacity(){
    return this.capacity;
  }

  @Override
  public void resetCapacity(){
    this.capacity = 0;
  }

  @Override
  public void addList(Car car){
    carList.add(car);
  }

  @Override
  public void resetList(){
    for(int i = 0; i < carList.size(); i++){
      carList.remove(i);
    }
  }

  @Override
  public ArrayList<Car> getCarList(){
    return carList;
  }

}
