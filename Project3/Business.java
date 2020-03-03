public class Business extends Customer {
  private int days;

  public Business(String name, String type){
    super(name, type, 0);
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
}
