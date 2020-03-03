//CarDecorator is an example of a Decrator pattern.
//We use the CarDecorator instance with the add-ons
//To add to the description of the car as well as which add-ons are added.
//The cost of the car changes by the add-on prices.
public abstract class CarDecorator implements Car {

  protected Car decoratedCar;

  public CarDecorator(Car newCar) {
    decoratedCar = newCar;
  }

  public String getDescription(){

    return decoratedCar.getDescription();
  }

  public int getCost(){

    return decoratedCar.getCost();
  }

  public abstract void setCost(int numDays);
}
