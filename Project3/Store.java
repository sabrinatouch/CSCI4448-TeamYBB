import java.util.ArrayList;

public class Store {
  //Private
  private int revenue = 0;
  private ArrayList<Car> availableCars = new ArrayList<Car>();

  //Add car to inventory.
  public void addCar(Car car) {
    this.availableCars.add(car);
  }

  //Remove car from inventory.
  public Car removeCar() {
    Car car = this.availableCars.get(0);
    this.availableCars.remove(0);
    return car;
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

  //This is to reset the store's profit for each day.
  public void resetProfit(){
    this.revenue = 0;
  }

  public void printList(){
    for(int i = 0; i < availableCars.size(); i++){
      System.out.println(availableCars.get(i).getDescription());
    }
  }

}
