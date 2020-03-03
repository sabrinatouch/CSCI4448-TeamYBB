//GPS is an add-on for the CarDecorator.
//GPS adds $100 to the cost of the rental.
public class GPS extends CarDecorator{

  //Inherit from decorator class.
  public GPS(Car newCar) {
    super(newCar);
  }

  //Add-on to the description of the decorator class.
  @Override
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
