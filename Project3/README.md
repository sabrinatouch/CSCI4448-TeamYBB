# Project 3: Car Rental Business Simulator

## Team Members
Andy Kim, Justin Vuong, Sabrina Touch

## Instructions
'''bash
javac Main.javac
java main
'''

## Language and Environment
Java 13+

## Program Design
This simulator utilizes a Main method to organize the order of what is being called and executed.

From the Main, the program begins populating the environment with Car and Customer object instances that are created via the CarFactory and CustomerFactory.

Car is an interface that allows us to have the different types of cars extended from it: Economy, Standard, Luxury, SUV, and Minivan.

Customer is an abstract class. For the different types of customers, they are extended from the Customer class (Casual, Business, Regular).

The Customer can add on a GPS, Radio, or CarSeat(s) to their Car. This is done with the decorator pattern that implements Car.

The Store class is then called executing the beginning of the 35-days simulation.
[More about the store simulation]

A Rental class creates an ArrayList that records the information per customer.

## Assumptions
"At the beginning of each day, print the following..."
- Did not print at the beginning of Day 1 since nothing has happened yet. Began printing at "beginning of each day" by Day 2.
