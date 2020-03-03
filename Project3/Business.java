public class Business extends Customer {
  private int days;
  private int capacity = 0;

  public Business(String name, String type){
    super(name, type);
  }

  @Override
  public int getNumCars(){
    return 3;
  }

  @Override
  public String getName(){
    return name;
  }

  @Override
  public void generateDays(){
    this.days = 7;
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

}
