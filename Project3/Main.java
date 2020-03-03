/********************************************************
**                                                     **
** Team Members: Justin Vuong, Sabrina Touch, Andy Kim **
**        CSCI4448-Object Oriented Programming         **
**                     Project 3                       **
**                                                     **
********************************************************/

import java.util.*;
import java.io.*;

/* -------------------------- Main -------------------------- */
public class Main
{
  public static void main(String[] args)
  {

    //Initial setup for cars, customers, and store.

    //Instantiate a car factory and create 24 cars that consist of each category.
    CarFactory carFactory = new CarFactory();

    Car car1 = carFactory.createCar("SUV123", "SUV");
    Car car2 = carFactory.createCar("SUV124", "SUV");
    Car car3 = carFactory.createCar("SUV125", "SUV");
    Car car4 = carFactory.createCar("SUV126", "SUV");
    Car car5 = carFactory.createCar("SUV127", "SUV");

    Car car6 = carFactory.createCar("MIN123", "Minivan");
    Car car7 = carFactory.createCar("MIN124", "Minivan");
    Car car8 = carFactory.createCar("MIN125", "Minivan");
    Car car9 = carFactory.createCar("MIN126", "Minivan");
    Car car10 = carFactory.createCar("MIN127", "Minivan");

    Car car11 = carFactory.createCar("LUX123", "Luxury");
    Car car12 = carFactory.createCar("LUX124", "Luxury");
    Car car13 = carFactory.createCar("LUX125", "Luxury");
    Car car14 = carFactory.createCar("LUX126", "Luxury");
    Car car15 = carFactory.createCar("LUX127", "Luxury");

    Car car16 = carFactory.createCar("ECO123", "Economy");
    Car car17 = carFactory.createCar("ECO124", "Economy");
    Car car18 = carFactory.createCar("ECO125", "Economy");
    Car car19 = carFactory.createCar("ECO126", "Economy");
    Car car20 = carFactory.createCar("ECO127", "Economy");

    Car car21 = carFactory.createCar("STA123", "Standard");
    Car car22 = carFactory.createCar("STA124", "Standard");
    Car car23 = carFactory.createCar("STA125", "Standard");
    Car car24 = carFactory.createCar("STA126", "Standard");

    //Instantiate a store and add the 24 cars into the store inventory.
    Store store = Store.Store();

    store.addCar(car1);
    store.addCar(car2);
    store.addCar(car3);
    store.addCar(car4);
    store.addCar(car5);
    store.addCar(car6);
    store.addCar(car7);
    store.addCar(car8);
    store.addCar(car9);
    store.addCar(car10);
    store.addCar(car11);
    store.addCar(car12);
    store.addCar(car13);
    store.addCar(car14);
    store.addCar(car15);
    store.addCar(car16);
    store.addCar(car17);
    store.addCar(car18);
    store.addCar(car19);
    store.addCar(car20);
    store.addCar(car21);
    store.addCar(car22);
    store.addCar(car23);
    store.addCar(car24);

    //Instantiate a Customer factory and create 12 customers with 3 different categories.
    CustomerFactory customerFactory = new CustomerFactory();

    Customer customer1 = customerFactory.createCustomer("Joe", "Regular");
    Customer customer2 = customerFactory.createCustomer("Bob", "Regular");
    Customer customer3 = customerFactory.createCustomer("James", "Regular");
    Customer customer4 = customerFactory.createCustomer("Tom", "Regular");

    Customer customer5 = customerFactory.createCustomer("Josh", "Business");
    Customer customer6 = customerFactory.createCustomer("John", "Business");
    Customer customer7 = customerFactory.createCustomer("Luke", "Business");
    Customer customer8 = customerFactory.createCustomer("Sabs", "Business");

    Customer customer9 = customerFactory.createCustomer("Justin", "Casual");
    Customer customer10 = customerFactory.createCustomer("Suebin", "Casual");
    Customer customer11 = customerFactory.createCustomer("Andy", "Casual");
    Customer customer12 = customerFactory.createCustomer("Eric", "Casual");


    // Making a list of all the customer objects
    ArrayList<Customer> listofCustomers = new ArrayList<Customer>();
    // This list holds customers that have currently made car rentals.
    ArrayList<Customer> rentingCustomers = new ArrayList<Customer>();

    //Add all the customers to the list of customers.
    listofCustomers.add(customer1);
    listofCustomers.add(customer2);
    listofCustomers.add(customer3);
    listofCustomers.add(customer4);
    listofCustomers.add(customer5);
    listofCustomers.add(customer6);
    listofCustomers.add(customer7);
    listofCustomers.add(customer8);
    listofCustomers.add(customer9);
    listofCustomers.add(customer10);
    listofCustomers.add(customer11);
    listofCustomers.add(customer12);

    //Start at day 1.
    int num_day = 1;
    int completed_rentals = 0;

    //Generate number of days the customers will rent the cars for
    //and the number of cars the customers will rent.
    for(int i = 0; i < listofCustomers.size(); i++){
      Customer currCust = listofCustomers.get(i);
      currCust.generateDays();
      currCust.generateNumCars();
    }

    //Create a simulation for 35 days.
    while(num_day <= 35){

      //Create a list to keep track of completed rentals.
      ArrayList<String> completedRentals = new ArrayList<String>();

      //Formatting print statements.
      System.out.println("");
      System.out.println("|-------------------------------------------------------------------------|");
      System.out.println("");
      System.out.println("DAY #:" + num_day);

      //Random seeds for randomly generated numbers.
      Random rand = new Random();
      Random rand1 = new Random();
      Random rand2 = new Random();
      Random rand3 = new Random();

      //Set the new day's revenue to zero.
      int revenue = 0;
      //Create a random number of customers that will visit the store that day.
      int number_customers = rand.nextInt(12) + 1;

      //Shuffle the customer list to ensure we don't keep grabbing
      //The same customers in order.
      Collections.shuffle(listofCustomers);

      //For each customer, check to see if they can make a car rental to the store.
      for (int i = 0; i < number_customers; i++){

        //Generate a random boolean for each add-on. If true, we will add the option to the car.
        boolean Radio = rand1.nextBoolean();
        boolean Gps = rand2.nextBoolean();
        boolean CSeat = rand3.nextBoolean();

        //A customer can only make a rental if there are cars available in the store.
        //We will limit the number of customers that are able to make the rental to 12. (since there are 12 customers)
        if((store.getCapacity() > 0) && (rentingCustomers.size() < 12)){
          //Get the information needed from a given customer,
          //which includes the customer's capacity, (limit on the cars they can rent)
          //and the number of cars they can rent.
          Customer tempCustomer = listofCustomers.get(i);
          int tempCustomerCapacity = tempCustomer.getCapacity();
          int tempCustomerNumCars = tempCustomer.getNumCars();
          //Retrieve the number of cars the store has.
          int storeCapacity = store.getCapacity();

          //Check if the customer is able to rent out their desired number of cars from the store.
          //First, we need to make sure the customer's capacity is less than three,
          //meaning that they can still rent cars.
          //Second, we will have to see if this capacity added with their desired number of cars
          //exceeds three. If it does, the customer cannot make the rental.
          //Third, we will have to see if the store has as many cars as the customer's desired number of cars.
          //If all of these conditions are met, the customer is able to make a rental.
          if((tempCustomerCapacity < 3) && ((tempCustomerCapacity + tempCustomerNumCars) <= 3) && ((storeCapacity - tempCustomerNumCars) >= 0)){

            //Build a string to print out to the screen.
            String sentence = "";

            //Get the customer's name.
            sentence += tempCustomer.getName() + " ";

            //Add customer to active rental.
            rentingCustomers.add(tempCustomer);

            //Make a rental for the number of cars the customer wants to rent.
            for(int j = 0; j < tempCustomer.getNumCars(); j++){
              //Take out the car from the store.
              Car rentalCar = store.removeCar();
              //Add the car to the customer's list of car rentals.
              tempCustomer.addList(rentalCar);
              //Set the cost of the rental multiplied by the number of days they are renting.
              rentalCar.setCost(tempCustomer.getDays());

              //Check to see if the car comes with the add-ons.
              //If they do, decorate the rentalCar with the add-ons.
              if(Radio){
                rentalCar = new Radio(rentalCar);
              }
              if(Gps){
                rentalCar = new GPS(rentalCar);
              }
              if(CSeat){
                rentalCar = new CarSeat(rentalCar);
              }

              //Increase the customer's capacity. (max for a customer is 3)
              tempCustomer.setCapacity(1);
              sentence += rentalCar.getDescription() + " ";

              //Add the rental cost to the store's revenue.
              store.addRevenue(rentalCar.getCost());
              //This is to track the daily revenue.
              revenue += rentalCar.getCost();

            }
          }
        }
      }

      //Use iterator to iterate through rentingCustomers list.
      Iterator<Customer> iterator = rentingCustomers.iterator();

      while(iterator.hasNext()){

        Customer Current = iterator.next();

        //If the number of days for a given customer is zero, that means
        //the rental time has expired and the customer must return all of their cars from
        //their list of cars they have rented back to the store.
        if(Current.getDays() == 0){

          //Build a string for printing to output.
          String sentence = "";

          sentence += Current.getName();
          sentence += Current.getDays();

          //Access the customer's current list of cars they have rented.
          ArrayList<Car> currentCars = new ArrayList<Car>();
          currentCars = Current.getCarList();

          //System.out.println("");
          //System.out.println("Current Cars: " + currentCars);

          //Iterate through the car list.
          for(int j = 0; j < currentCars.size(); j++){

            //Grab the instance of the car from the list.
            Car returningCar = currentCars.get(j);
            sentence += returningCar.getDescription();
            sentence += returningCar.getCost();
            String name = returningCar.getName();
            String type = returningCar.getType();

            //Using the name and the type of the returning car, re-create the instance to
            //add back into the store list.
            Car newCar = carFactory.createCar(name, type);
            store.addCar(newCar);

            //Increment completed rentals.
            completed_rentals += 1;
          }

          //Add the built string to the list of completed Rentals.
          completedRentals.add(sentence);

          //Clear the customer's list.
          Current.resetList();
          //Reset the customer's capacity.
          Current.resetCapacity();
          //Reset the number of days the customer can rent for.
          Current.resetDays();

          //Remove the customer from the rentingCustomer list.
          iterator.remove();
        }

        //If the number of days of a customer is not zero yet, decrement it by 1.
        else{
          Current.decrement();
        }

      }

      System.out.println("");
      System.out.println("DAILY COMPLETED RENTALS COUNT: " + completedRentals.size());

      //Print all completed rentals.
      for(int i = 0; i < completedRentals.size(); i++){
        System.out.println("\t" + completedRentals.get(i));
      }

      //Count number of active rentals
      int active_rentals_count = 0;

      for(int i = 0; i < rentingCustomers.size(); i++){
        if(!rentingCustomers.get(i).getCarList().isEmpty()){
          active_rentals_count += 1;
        }
      }

      System.out.println("");
      System.out.println("DAILY ACTIVE RENTALS COUNT: " + active_rentals_count);

      //At the end of the day, iterate through the renting customers list
      //and if the customer has currently rented out cars, print out their name
      //as well as the cars they have rented out.
      int counter = 0;

      for(int i = 0; i < rentingCustomers.size(); i++){
        if(!rentingCustomers.get(i).getCarList().isEmpty()){
          counter += 1;
          Customer rentingCustomer = rentingCustomers.get(i);

          System.out.println("\t" + counter + ". Customer Name: " + rentingCustomer.getName());
          System.out.println("\tLicense Plate: " + rentingCustomer.getCarList());
          System.out.println("");
        }
      }

      //Print the money made by store that day.
      System.out.println("DAILY REVENUE: $" + revenue);

      //Increment number of days.
      num_day += 1;

    }//end of while.

    System.out.println("");
    System.out.println("/-----------------------------------------------/");
    System.out.println("END OF SIMULATION REPORT");
    //Print out the total number of completed rentals made.
    System.out.println("\t- Total number of rentals: " + completed_rentals);
    //Print out the total amount of profit the store has made over 35 days.
    System.out.println("\t- Total money made for the 35 day period: $" + store.getProfit());

  }
}
