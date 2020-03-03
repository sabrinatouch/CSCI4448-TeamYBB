import java.util.Random;

public class Regular extends Customer {
  private int days;

  public Regular(String name, String type){
    super(name, type, 0);
  }

  @Override
  public int getNumCars(){
    Random rand = new Random();
    int random_number = rand.nextInt(3) + 1;
    return random_number;
  }

  @Override
  public String getName(){
    return name;
  }

  @Override
  public void generateDays(){
    Random rand = new Random();
    int random_number = rand.nextInt(3) + 3;
    this.days = random_number;
  }

  @Override
  public int getDays(){
    return this.days;
  }

  @Override
  public void decrement(){
    this.days = this.days - 1;
  }

}
