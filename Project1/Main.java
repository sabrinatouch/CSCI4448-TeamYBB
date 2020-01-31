/**
  Team Members: Justin Vuong, Sabrina Touch, Andy Kim
*/

/* -------------------------- Animal -------------------------- */
class Animal
{
  public String name;
  public String type;
  
  // Constructor of Animal Class
  public Animal()
  {

  }

  // Sleep Method
  public void sleep()
  {
    System.out.println("Goes to sleep");
  }

  // Eat Method
  public void eat()
  {
    System.out.println("Eats");
  }

  // Wake Up Method
  public void wakeUp()
  {
    System.out.println("Wakes Up");
  }
}

/* -------------------------- Level 1.2 -------------------------- */
class Feline extends Animal
{
  public Feline()
  {
    this.type = "Feline";
  }

  // Roam Method
  public void roam()
  {
    System.out.println("Strolls Around");
  }
}

class Cat extends Feline
{
  public Cat(String name)
  {
    this.name = name;
  }
  public void makeNoise()
  {
    System.out.println("Meows");
  }
}

class Tiger extends Feline
{
  public Tiger(String name)
  {
    this.name = name;
  }
  public void makeNoise()
  {
    System.out.println("Rawrs");
  }
}

class Lion extends Feline
{
  public Lion(String name)
  {
    this.name = name;
  }
  public void makeNoise()
  {
    System.out.println("Roars");
  }
}

/* -------------------------- Level 2.2 -------------------------- */
class Canine extends Animal
{
  public Canine()
  {
    this.type = "Canine";
  }

  // Roam Method
  public void roam()
  {
    System.out.println("Dashes Around");
  }
}

/* -------------------------- Level 2.3 -------------------------- */
class Wolf extends Canine
{
  public Wolf(String name)
  {
    this.name = name;
  }
  public void makeNoise()
  {
    System.out.println("Howls");
  }
}

class Dog extends Canine
{
  public Dog(String name)
  {
    this.name = name;
  }
  public void makeNoise()
  {
    System.out.println("Barks");
  }
}

/* -------------------------- Level 3.2 -------------------------- */
class Pachyderm extends Animal
{
  public Pachyderm()
  {
    this.type = "Pachyderm";
  }

  // Roam Method
  public void roam()
  {
    System.out.println("Stomps Around");
  }
}

/* -------------------------- Level 3.3 -------------------------- */
class Hippo extends Pachyderm
{
  public Hippo(String name)
  {
    this.name = name;
  }
  public void makeNoise()
  {
    System.out.println("Wheezes");
  }
}

class Elephant extends Pachyderm
{
  public Elephant(String name)
  {
    this.name = name;
  }
  public void makeNoise()
  {
    System.out.println("Trumpets");
  }
}

class Rhino extends Pachyderm
{
  public Rhino(String name)
  {
    this.name = name;
  }
  public void makeNoise()
  {
    System.out.println("Grunts");
  }
}

/* -------------------------- Zookeeper -------------------------- */
class Zookeeper
{
  // Construtor for Zookeeper class
  public Zookeeper()
  {
  }

  //Wake up animals
  public void wakeAnimals()
  {

  }
}

/* -------------------------- Main -------------------------- */
public class Main
{
  public static void Main(String[] args)
  {
  }
}
