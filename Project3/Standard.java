public class Standard implements Car {
  public String name;
  public String type;
  public int cost = 30;

  public Standard(String name, String type){
    this.name = name;
    this.type = type;
  }

  @Override
  public String getDescription(){
    return name + " " + type;
  }

  @Override
  public int getCost(){
    return cost;
  }

  @Override
  public void setCost(int numDays){
    this.cost = numDays * cost;
  }
}
