import java.util.List;

public class Store {
  //Private
  private int revenue = 0;
  private List<Car> availableCars;

  //Add car to inventory.
  public void addCar(Car car) {
    this.availableCars.add(car);
  }

  //Remove car from inventory.
  public void removeCar(Car car) {
    this.availableCars.remove(car);
  }

  //Getter.
  public int getCapacity(){
    return this.availableCars.size();
  }

  public void addRevenue(int number){
    this.revenue += number;
  }

  public int getProfit(){
    return this.revenue;
  }

}
