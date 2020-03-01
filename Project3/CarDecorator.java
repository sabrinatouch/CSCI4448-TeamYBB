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
}
