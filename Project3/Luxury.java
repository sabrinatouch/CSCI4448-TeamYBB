//Luxury implements interface Car.
//Default cost is $40/night.
public class Luxury implements Car {
  private String name;
  private String type;
  private int cost = 40;

  //Constructor for Luxury.
  public Luxury(String name, String type){
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
