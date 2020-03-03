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

    //Instantiate a car factory and create 24 cars of each category.
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
    Store store = new Store();

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

    store.printList();
    //System.out.println(store.getCapacity());

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
    Customer[] listofCustomers = new Customer[]
    {
      customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9, customer10, customer11, customer12
    };

    for(int i = 0; i < listofCustomers.length; i++){
      Customer currCust = listofCustomers[i];
      currCust.generateDays();
    }

    Random rand = new Random();
    int number_customers = rand.nextInt(12) + 1;

    while(Store.getCapacity() > 0){
      Customer tempCustomer;
      Collections.shuffle(listofCustomers);
      for (int i = 0; i< number_customers; i++){
          tempCustomer = listofCustomers.get(i);
      }
    }


}
