public abstract class Customer{
  public String name;
  public String type;
  public int numCars;
  public int days;

  public Customer(String name, String type){
    this.name = name;
    this.type = type;
  }

  public abstract int getDays();
  public abstract int getNumCars();

}
