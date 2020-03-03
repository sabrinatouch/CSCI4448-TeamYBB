public class Minivan implements Car {
  private String name;
  private String type;
  private int cost = 60;

  public Minivan(String name, String type){
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
