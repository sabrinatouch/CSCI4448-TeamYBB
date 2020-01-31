/**
  Team Members: Justin Vuong, Sabrina Touch, Andy Kim
*/

/* -------------------------- Animal -------------------------- */
public class Animal
{
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
public class Feline extends Animal
{
  public Feline()
  {
    this.type = 'Feline';
  }

  // Roam Method
  public void roam()
  {
    System.out.println("Strolls Around");
  }
}

/* -------------------------- Level 1.3 -------------------------- */
public class Cat extends Feline
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

public class Tiger extends Feline
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

public class Lion extends Feline
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
public class Canine extends Animal
{
  public Canine()
  {
    this.type = 'Canine';
  }

  // Roam Method
  public void roam()
  {
    System.out.println("Dashes Around");
  }
}

/* -------------------------- Level 2.3 -------------------------- */
public class Wolf extends Canine
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

public class Dog extends Canine
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
public class Pachyderm extends Animal
{
  public Pachyderm()
  {
    this.type = 'Pachyderm';
  }

  // Roam Method
  public void roam()
  {
    System.out.println("Stomps Around");
  }
}

/* -------------------------- Level 3.3 -------------------------- */
public class Hippo extends Pachyderm
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

public class Elephant extends Pachyderm
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

public class Rhino extends Pachyderm
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
public class Zookeeper
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
public static void main(String[] args)
{

}
