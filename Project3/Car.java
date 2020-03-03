public interface Car {
  //Subclasses can implement different costs and have different descriptions.
  public String getName();
  public String getType();
  public int getCost();
  public void setCost(int numDays);
}
