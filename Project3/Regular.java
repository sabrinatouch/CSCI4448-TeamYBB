import java.util.Random;

public class Regular extends Customer {

  public Regular(String name, String type){
    super(name, type);
  }

  @Override
  public int getDays(){
    Random rand = new Random();
    int random_number = rand.nextInt(3) + 3;
    return random_number;
  }

  @Override
  public int getNumCars(){
    Random rand = new Random();
    int random_number = rand.nextInt(3) + 1;
    return random_number;
  }
}
