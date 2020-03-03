import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

//Use of Singleton design pattern here. We want to ensure that there is only one
//Instance of Store, as there's only one location of the rental store specified
//by the Assignment.
public class Store {
  //Private
  private static Store single_instance = null;
  private int revenue = 0;
  private Queue<Car> availableCars = new LinkedList<>();

  private Store(){

  }

  public static Store Store(){
    if(single_instance == null){
      single_instance = new Store();
    }

    return single_instance;
  }

  //Add car to inventory.
  public void addCar(Car car) {
    this.availableCars.add(car);
  }

  //Remove car from inventory.
  public Car removeCar() {
    Car car = this.availableCars.peek();
    this.availableCars.remove();
    return car;
  }

  //Getter.
  public int getCapacity(){
    if(this.availableCars.isEmpty()){
      return 0;
    }
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
    if(this.availableCars.isEmpty()){
      System.out.println("Store Inventory Empty.");
    }
    else{
      for(Car c: this.availableCars){
        System.out.println(c.getDescription());
      }
    }


  }

}
