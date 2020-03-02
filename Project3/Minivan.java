public class Minivan implements Car {
  private String name;
  private String type;
  private int cost = 60;

  public Minivan(String name, String type){
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
