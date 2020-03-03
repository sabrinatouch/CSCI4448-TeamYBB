public class Radio extends CarDecorator{

  public Radio(Car newCar) {
    super(newCar);
  }

  @Override
  public String getDescription(){
    return decoratedCar.getDescription() + ", Radio";
  }

  @Override
  public int getCost(){
    return decoratedCar.getCost() + 50;
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
