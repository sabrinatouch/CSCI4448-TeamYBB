//Radio is an add-on to the decorator.
//Radio adds $50 to the car rental price.
public class Radio extends CarDecorator{

  //Inherit from Decorator class.
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
