public abstract class Customer{
  protected String name;
  private String type;
  protected int numCars;
  protected int maxCars;

  public Customer(String name, String type, int maxCars){
    this.name = name;
    this.type = type;
    this.maxCars = maxCars;
  }

  public abstract String getName();
  public abstract int getNumCars();
  public abstract void generateDays();
  public abstract int getDays();
  public abstract void decrement();

}
