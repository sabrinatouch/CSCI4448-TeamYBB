//THIS IS AN EXAMPLE OF FACTORY PATTERN.
//THE FACTORY WILL INSTANTIATE AN INSTANCE OF A CAR
//BASED ON THE TYPE BEING PASSED IN AS A PARAMETER.

public class CarFactory {
  public Car createCar(String name, String type){
    if(type == null){
      return null;
    }

    if(type.equalsIgnoreCase("Economy")){
      return new Economy(name, type);
    }
    else if(type.equalsIgnoreCase("Standard")){
      return new Standard(name, type);
    }
    else if(type.equalsIgnoreCase("Luxury")){
      return new Luxury(name, type);
    }
    else if(type.equalsIgnoreCase("SUV")){
      return new SUV(name, type);
    }
    else if(type.equalsIgnoreCase("Minivan")){
      return new Minivan(name, type);
    }

    return null;

  }

}
