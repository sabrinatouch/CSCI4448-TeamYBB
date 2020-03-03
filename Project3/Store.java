import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

//Use of Singleton design pattern here. We want to ensure that there is only one
//Instance of Store, as there's only one location of the rental store specified
//by the Assignment.
public class Store {

  //The Store class handles the store's revenue as well as the inventory of cars available.
  //We used a queue to facilitate the popping and inserting of cars from the inventory.
  private static Store single_instance = null;
  private int revenue = 0;
  private Queue<Car> availableCars = new LinkedList<>();

  //Empty constructor.
  private Store(){

  }

  //Singleton method.
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

  //Returns the size of the inventory. (number of cars in the store)
  public int getCapacity(){
    //If the inventory is empty, return zero.
    if(this.availableCars.isEmpty()){
      return 0;
    }
    return this.availableCars.size();
  }

  //Add to the revenue of the store.
  public void addRevenue(int number){
    this.revenue += number;
  }

  //Retrieve the profit from the store.
  public int getProfit(){
    return this.revenue;
  }

  //This method prints the car descriptions of all the cars available
  //in the inventory.
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
