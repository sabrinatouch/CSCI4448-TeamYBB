public class GPS extends CarDecorator{

  public GPS(Car newCar) {
    super(newCar);
  }

  public String getDescription(){
    return decoratedCar.getDescription() + ", GPS";
  }

  @Override
  public int getCost(){
    return decoratedCar.getCost() + 100;
  }

  public void setCost(int numDays){
    return;
  }

  public String getName(){
    return "";
  }

  public String getType(){
    return "";
  }
}
