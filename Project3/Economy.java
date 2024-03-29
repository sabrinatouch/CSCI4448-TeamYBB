//Economy implements interface Car.
//Default cost is $20/night.
public class Economy implements Car {
  //Change to private.
  private String name;
  private String type;
  private int cost = 20;

  //Constructor for Economy.
  public Economy(String name, String type){
    this.name = name;
    this.type = type;
  }

  @Override
  public String getName(){
    return this.name;
  }

  @Override
  public String getType(){
    return this.type;
  }

  @Override
  public int getCost(){
    return this.cost;
  }

  @Override
  public void setCost(int numDays){
    this.cost = numDays * cost;
  }

  public String getDescription(){
    return name + type;
  }

}
