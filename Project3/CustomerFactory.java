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
