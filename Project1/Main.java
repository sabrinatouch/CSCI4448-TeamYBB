/**
  Team Members: Justin Vuong, Sabrina Touch, Andy Kim
*/

/* -------------------------- Animal -------------------------- */
class Animal
{
  //Creating private variables name and type
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

  // Method to get the animal's name
  public String getName()
  {
      return name;
  }
  
  // Method to get animal's subtype
  public String getType()
  {
      return type;
  }
}

/* -------------------------- Level 1.2 -------------------------- */
class Feline extends Animal
{
  //https://www.geeksforgeeks.org/super-keyword/ Seeing how to use super 
  //Any animal made that extends Feline will have the Feline type automatically
  public Feline(String name)
  {
    super(name, "Feline");
  }

  // Roam Method for Felines
  public String roam()
  {
    return("Strolls Around");
  }
}

class Cat extends Feline
{
  //Constructs a Cat with given name
  public Cat(String name)
  {
    super(name);
  }
  //Each of the methods use the randomAction method to randomize the cat's actions
   public String sleep()
  {
    return randomAction();
  }

  public String eat()
  {
    return randomAction();
  }

  public String wakeUp()
  {
    return randomAction();
  }

  public String roam()
  {
    return randomAction();
  }

  public String makeNoise()
  {
    return randomAction();
  }
  //Method to randomize what the cat is doing
  public String randomAction()
  {
    // https://www.educative.io/edpresso/how-to-use-the-mathrandom-method-in-java source for randomizing
    int range = (5 - 1) + 1;
    int action = (int)(Math.random() * range) + 1;
    
    //Uses switch cases to determine what action the cat will take
    switch(action)
    {
        case 1:
            return("Goes to sleep");

        case 2:
            return("Eats");

        case 3:
            return("Wakes Up");

        case 4:
            return("Strolls Around");

        default:
            return("Meows");
    }
  }
}

class Tiger extends Feline
{
  //Constructs a Tiger with given name
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
  //Constructs a Lion with given name
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
  /Any animal made that extends Canine will have the Canine type automatically
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
  //Constructs a Wolf with given name
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
  //Constructs a Dog with given name
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
  ///Any animal made that extends Pachyderm will have the Pachyderm type automatically
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
  //Constructs a Hippo with given name
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
  //Constructs a Elephant with given name
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
  //Constructs a Rhino with given name
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

  //All animals will call the wake up method
  public void wakeAnimals(Animal[] animalList)
  {
    System.out.println("Zookeeper wakes up animals\n");
    for (int i = 0; i<animalList.length; i++)
    {
        Animal currAnimal = animalList[i];
        System.out.println(currAnimal.getName() + ", " + currAnimal.getType() + ", " + currAnimal.wakeUp());
    }
        System.out.println();
  }

  //All animals will call the make noise method
  public void rollCallAnimals(Animal[] animalList)
  {
    System.out.println("Zookeeper roll calls animals\n");
    for (int i = 0; i<animalList.length; i++)
    {
        Animal currAnimal = animalList[i];
        System.out.println(currAnimal.getName() + ", " + currAnimal.getType() + ", " + currAnimal.makeNoise());
    }
        System.out.println();
  }

  //All animals eat
  public void feedAnimals(Animal[] animalList)
  {
    System.out.println("Zookeeper feeds animals\n");
    for (int i = 0; i<animalList.length; i++)
    {
        Animal currAnimal = animalList[i];
        System.out.println(currAnimal.getName() + ", " + currAnimal.getType() + ", " + currAnimal.eat());
    }
        System.out.println();
  }

  //All animals roam
  public void exerciseAnimals(Animal[] animalList)
  {
    System.out.println("Zookeeper feeds animals\n");
    for (int i = 0; i<animalList.length; i++)
    {
        Animal currAnimal = animalList[i];
        System.out.println(currAnimal.getName() + ", " + currAnimal.getType() + ", " + currAnimal.roam());
    }
        System.out.println();
  }

  //All animals go to sleep
  public void shutDown(Animal[] animalList)
  {
    System.out.println("Zookeeper shuts down the zoo\n");
    for (int i = 0; i<animalList.length; i++)
    {
        Animal currAnimal = animalList[i];
        System.out.println(currAnimal.getName() + ", " + currAnimal.getType() + ", " + currAnimal.sleep());
    }
        System.out.println();
  }


}

/* -------------------------- Main -------------------------- */
public class Main
{
  public static void main(String[] args)
  {
    //Creating 2 instances of each type of animal
    Cat carla = new Cat("Carla");
    Cat chloe = new Cat("Chloe");
    Tiger tony = new Tiger("Tony");
    Tiger tim = new Tiger("Tim");
    Lion leo = new Lion("Leo");
    Lion louis = new Lion("Louis");
    Wolf wally = new Wolf("Wally");
    Wolf warwick = new Wolf("Warwick");
    Hippo henry = new Hippo("Henry");
    Hippo happy = new Hippo("Happy");
    Elephant ellie = new Elephant("Ellie");
    Elephant eric = new Elephant("Eric");
    Rhino reese = new Rhino("Reese");
    Rhino rick = new Rhino("Rick");
    
    //Making a list of all the animal objects
    Animal[] listofAnimals = new Animal[]
    {
        carla, chloe, tony, tim, leo, louis, wally, warwick, henry, happy, ellie, eric, reese, rick
    };
    
    //Created instance of zookeeper
    Zookeeper khoa = new Zookeeper();
    
    //Calls each method coresponding to each of the zookeeper's responsibilities
    khoa.wakeAnimals(listofAnimals);
    khoa.rollCallAnimals(listofAnimals);
    khoa.feedAnimals(listofAnimals);
    khoa.exerciseAnimals(listofAnimals);
    khoa.shutDown(listofAnimals);
  }
}
