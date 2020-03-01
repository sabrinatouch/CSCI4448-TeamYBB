public class Radio extends CarDecorator{

  public Radio(Car newCar) {
    super(newCar);
    System.out.println("Adding Radio");
  }

  public String getDescription(){
    return decoratedCar.getDescription() + ", Radio";
  }

  public int getCost(){
    return decoratedCar.getCost() + 50;
  }
}
