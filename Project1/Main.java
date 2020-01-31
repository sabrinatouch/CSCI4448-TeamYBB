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

  public String randomAction()
  {
    int range = (5 - 1) + 1;
    int action = (int)(Math.random() * range) + 1;

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
    System.out.println("Zookeeper wakes up animals\n");
    for (int i = 0; i<animalList.length; i++)
    {
        Animal currAnimal = animalList[i];
        System.out.println(currAnimal.getName() + ", " + currAnimal.getType() + ", " + currAnimal.wakeUp());
    }
        System.out.println();
  }

  //Roll call animals
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

  //Feed animals
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

  //Exercise animals
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

  //Shut down Zoo
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
    Animal[] listofAnimals = new Animal[]
    {
        carla, chloe, tony, tim, leo, louis, wally, warwick, henry, happy, ellie, eric, reese, rick
    };
    Zookeeper khoa = new Zookeeper();
    khoa.wakeAnimals(listofAnimals);
    khoa.rollCallAnimals(listofAnimals);
    khoa.feedAnimals(listofAnimals);
    khoa.exerciseAnimals(listofAnimals);
    khoa.shutDown(listofAnimals);
  }
}
