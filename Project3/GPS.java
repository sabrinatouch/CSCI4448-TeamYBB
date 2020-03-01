public class GPS extends CarDecorator{

  public GPS(Car newCar) {
    super(newCar);

    System.out.println("Adding GPS");
  }

  public String getDescription(){
    return decoratedCar.getDescription() + ", GPS";
  }

  public int getCost(){
    return decoratedCar.getCost() + 100;
  }
}
