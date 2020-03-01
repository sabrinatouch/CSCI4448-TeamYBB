public class Business extends Customer {

  public Business(String name, String type){
    super(name, type);
  }

  @Override
  public int getDays(){
    return 7;
  }

  @Override
  public int getNumCars(){
    return 3;
  }
}
