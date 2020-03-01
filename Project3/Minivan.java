public class Minivan implements Car {
  public String name;
  public String type;

  public Minivan(String name, String type){
    this.name = name;
    this.type = type;
  }

  @Override
  public String getDescription(){
    return "";
  }

  @Override
  public int getCost(){
    return 0;
  }
}
