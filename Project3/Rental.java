import java.util.ArrayList;
public class Rental{
  private ArrayList<Object> rentalRecord = new ArrayList <>();

  public ArrayList<Object> createRental(ArrayList<Object> carsRented, int nights){
    ArrayList<Object> rentals = new ArrayList <>();
    for(int i = 0; i < carsRented.size(); i++){
      rentals.add(carsRented.get(i));
    }
    rentals.add(nights);
    return rentals;
  }
}
