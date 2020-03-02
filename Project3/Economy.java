public class Economy implements Car {
  //Change to private.
  private String name;
  private String type;
  private int cost = 20;

  public Economy(String name, String type){
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
