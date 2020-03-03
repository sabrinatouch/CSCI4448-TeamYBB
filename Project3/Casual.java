import java.util.Random;

public class Casual extends Customer {
  private int days;

  public Casual(String name, String type){
    super(name, type, 0);
  }

  @Override
  public int getNumCars(){
    return 1;
  }

  @Override
  public String getName(){
    return name;
  }

  @Override
  public void generateDays(){
    Random rand = new Random();
    int random_number = rand.nextInt(4) + 1;
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
