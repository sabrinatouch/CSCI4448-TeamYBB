import java.util.Random;

public class Casual extends Customer {

  public Casual(String name, String type){
    super(name, type);
  }

  @Override
  public int getDays(){
    Random rand = new Random();
    int random_number = rand.nextInt(4) + 1;
    return random_number;
  }

  @Override
  public int getNumCars(){
    return 1;
  }
}
