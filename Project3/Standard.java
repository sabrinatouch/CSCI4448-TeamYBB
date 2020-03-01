public class Standard implements Car {
  @Override
  public String getDescription(){
    return "Standard";
  }

  @Override
  public int getCost(){
    return 270;
  }
}
