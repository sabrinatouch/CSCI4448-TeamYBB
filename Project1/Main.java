/**
  Team Members: Justin Vuong, Sabrina Touch, Andy Kim
*/

/* -------------------------- Animal -------------------------- */
class Animal
{
  private String name;
  private String type;

  // Constructor of Animal Class
  public Animal(String name, String type)
  {
    this.name = name;
    this.type = type;
  }

  // Sleep Method
  public String sleep()
  {
    return("Goes to sleep");
  }

  // Eat Method
  public String eat()
  {
    return("Eats");
  }

  // Wake Up Method
  public String wakeUp()
  {
    return("Wakes Up");
  }
  
  // Roam Method
  public String roam()
  {
    return("Roams");
  }
  
  // Make noise Method
  public String makeNoise()
  {
    return("Animal Noises");
  }
  
  public String getName()
  {
      return name;
  }
  
  public String getType()
  {
      return type;
  }
}

/* -------------------------- Level 1.2 -------------------------- */
class Feline extends Animal
{
  public Feline(String name)
  {
    super(name, "Feline");
  }

  // Roam Method
  public String roam()
  {
    return("Strolls Around");
  }
}

class Cat extends Feline
{
  public Cat(String name)
  {
    super(name);
  }
  public String makeNoise()
  {
    return("Meows");
  }
}

class Tiger extends Feline
{
  public Tiger(String name)
  {
    super(name);
  }
  public String makeNoise()
  {
    return("Rawrs");
  }
}

class Lion extends Feline
{
  public Lion(String name)
  {
    super(name);
  }
  public String makeNoise()
  {
    return("Roars");
  }
}

/* -------------------------- Level 2.2 -------------------------- */
class Canine extends Animal
{
  public Canine(String name)
  {
    super(name, "Canine");
  }

  // Roam Method
  public String roam()
  {
    return("Dashes Around");
  }
}

/* -------------------------- Level 2.3 -------------------------- */
class Wolf extends Canine
{
  public Wolf(String name)
  {
    super(name);
  }
  public String makeNoise()
  {
    return("Howls");
  }
}

class Dog extends Canine
{
  public Dog(String name)
  {
    super(name);
  }
  public String makeNoise()
  {
    return("Barks");
  }
}

/* -------------------------- Level 3.2 -------------------------- */
class Pachyderm extends Animal
{
  public Pachyderm(String name)
  {
    super(name, "Pachyderm");
  }

  // Roam Method
  public String roam()
  {
    return("Stomps Around");
  }
}

/* -------------------------- Level 3.3 -------------------------- */
class Hippo extends Pachyderm
{
  public Hippo(String name)
  {
    super(name);
  }
  public String makeNoise()
  {
    return("Wheezes");
  }
}

class Elephant extends Pachyderm
{
  public Elephant(String name)
  {
    super(name);
  }
  public String makeNoise()
  {
    return("Trumpets");
  }
}

class Rhino extends Pachyderm
{
  public Rhino(String name)
  {
    super(name);
  }
  public String makeNoise()
  {
    return("Grunts");
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
  public void wakeAnimals(Animal[] animalList)
  {
    for (int i = 0; i<animalList.length; i++)
    {
        Animal currAnimal = animalList[i];
        System.out.println(currAnimal.getName());
        System.out.println(currAnimal.getType());
        System.out.println(currAnimal.wakeUp());
    }
  }
}

/* -------------------------- Main -------------------------- */
public class Main
{
  public static void main(String[] args)
  {
    Cat Carla = new Cat("Carla");
    Cat Chloe = new Cat("Chloe");
    Tiger Tony = new Tiger("Tony");
    Tiger Tim = new Tiger("Tim");
    Lion Leo = new Lion("Leo");
    Lion Louis = new Lion("Louis");
    Wolf Wally = new Wolf("Wally");
    Wolf Warwick = new Wolf("Warwick");
    Hippo Henry = new Hippo("Henry");
    Hippo Happy = new Hippo("Happy");
    Elephant Ellie = new Elephant("Ellie");
    Elephant Eric = new Elephant("Eric");
    Rhino Reese = new Rhino("Reese");
    Rhino Rick = new Rhino("Rick");
    Animal[] listofAnimals = new Animal[]
    {
        Carla, Chloe, Tony, Tim, Leo, Louis, Wally, Warwick, Henry, Happy, Ellie, Eric, Reese, Rick
    };
    Zookeeper Khoa = new Zookeeper();
    Khoa.wakeAnimals(listofAnimals);
  }
}
