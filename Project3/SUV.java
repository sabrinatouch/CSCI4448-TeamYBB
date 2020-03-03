//SUV implements from interface Car.
//Default cost is $50/night.
public class SUV implements Car {
  private String name;
  private String type;
  private int cost = 50;

  //Constructor for SUV.
  public SUV(String name, String type){
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
