import java.util.ArrayList;
public class Rental{

  public ArrayList<Car> createRental(ArrayList<Car> carsRented){
    ArrayList<Car> rentals = new ArrayList <>();
    for(int i = 0; i < carsRented.size(); i++){
      rentals.add(carsRented.get(i));
    }
    return rentals;
  }
}
