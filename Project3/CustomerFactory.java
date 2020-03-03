//Example of Factory pattern.
//Depending on the type of the Customer being passed in as a parameter
//in the instance, the factory will create a Customer of the specified type.
public class CustomerFactory {
  public Customer createCustomer(String name, String type){
    if(type == null){
      return null;
    }

    if(type.equalsIgnoreCase("Casual")){
      return new Casual(name, type);
    }
    else if(type.equalsIgnoreCase("Business")){
      return new Business(name, type);
    }
    else if(type.equalsIgnoreCase("Regular")){
      return new Regular(name, type);
    }

    return null;

  }

}
