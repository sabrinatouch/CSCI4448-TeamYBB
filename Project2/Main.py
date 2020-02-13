'''
  Team Members: Justin Vuong, Sabrina Touch, Andy Kim
'''
import random
from strategy import strollingStrategy
from strategy import dashingStrategy

stroll = strollingStrategy()
dash = dashingStrategy()

# -------------------------- Animal --------------------------
class Animal:
    def __init__(self, name, type, roam_strategy):
        self.name = name
        self.type = type
        self.roam_strategy = roam_strategy

    # Sleep method
    def sleep(self):
        return "Goes to sleep"

    # Eat method
    def eat(self):
        return "Eats"

    # Wake up method
    def wakeUp(self):
        return "Wakes Up"

    # Roam method
    def roam(self):
        self.__roam_strategy.roam()

    # Make noise method
    def makeNoise(self):
        return "Animal Noises"

# -------------------------- Second Level of Inheritance --------------------------
class Feline(Animal):
    def __init__(self, name, roam_strategy):
        super().__init__(name, "Feline", roam_strategy)

    #Feline's Specific Roam Method
    def roam(self):
        return "Strolls Around"

class Canine(Animal):
    def __init__(self, name, roam_strategy):
        super().__init__(name, "Canine", roam_strategy)

    def roam(self):
        return "Dashes Around"

class Pachyderm(Animal):
    def __init__(self, name, roam_strategy):
        super().__init__(name, "Pachyderm", roam_strategy)

    def makeNoise(self):
        return "Trumpets"

# -------------------------- Third Level of Inheritance --------------------------
class Cat(Feline):
    def __init__(self, name):
        super().__init__(name)

      #Each of these methods use the randomAction method to randomize the cat's actions
    def sleep(self):
        action = random.randint(0, 5)
        return self.randomAction(action)

    def eat(self):
        action = random.randint(0, 5)
        return self.randomAction(action)

    def wakeUp(self):
        action = random.randint(0, 5)
        return self.randomAction(action)

    def roam(self):
        action = random.randint(0, 5)
        return self.randomAction(action)

    def makeNoise(self):
        action = random.randint(0, 5)
        return self.randomAction(action)

    #Method to randomize what the cat is doing
    def randomAction(self, argument):
        switcher={
                1: "Goes to sleep",
                2: "Eats",
                3: "Wakes Up",
                4: "Strolls Around",
                5: "Meows"
        }

        return switcher.get(argument, "Goes to sleep")

#Remaining Third Level Animal Classes
#Each of these classes have their own make noise method
class Tiger(Feline):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        return "Rawrs"

class Lion(Feline):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        return "Roars"

class Wolf(Canine):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        return "Howls"

class Dog(Canine):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        return "Barks"

class Hippo(Pachyderm):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        return "Wheezes"

class Elephant(Pachyderm):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        return "Trumpets"

class Rhino(Pachyderm):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        return "Grunts"

# -------------------------- Third Level of Inheritance --------------------------
class Zookeeper:
    #Waking up all animals
    def wakeAnimals(self, list):
        print("Zookeeper wakes up animals\n")
        for i in range(len(list)):
            currAnimal = AnimalList[i]
            print(currAnimal.name + ", " + currAnimal.type + ", " + currAnimal.wakeUp())
        print()
    #Roll calling all animals
    def rollCall(self, list):
        print("Zookeeper roll calls animals\n")
        for i in range(len(list)):
            currAnimal = AnimalList[i]
            print(currAnimal.name + ", " + currAnimal.type + ", " + currAnimal.makeNoise())
        print()
    #Feed the animals
    def feedAnimals(self, list):
        print("Zookeeper feeds animals\n")
        for i in range(len(list)):
            currAnimal = AnimalList[i]
            print(currAnimal.name + ", " + currAnimal.type + ", " + currAnimal.eat())
        print()
    #Exercise all the animals
    def exerciseAnimals(self, list):
        print("Zookeeper exercise animals\n")
        for i in range(len(list)):
            currAnimal = AnimalList[i]
            print(currAnimal.name + ", " + currAnimal.type + ", " + currAnimal.roam())
        print()
    #Shut down the zoo
    def shutDown(self, list):
        print("Zookeeper shuts down the zoo\n")
        for i in range(len(list)):
            currAnimal = AnimalList[i]
            print(currAnimal.name + ", " + currAnimal.type + ", " + currAnimal.sleep())
        print()

# -------------------------- Instantiation and Calls --------------------------
carla = Cat("Carla")
chloe = Cat("Chloe")
tony = Tiger("Tony")
tim = Tiger("Tim")
leo = Lion("Leo")
louis = Lion("Louis")
wally = Wolf("Wally")
warwick = Wolf("Warwick")
henry = Hippo("Henry")
happy = Hippo("Happy")
ellie = Elephant("Ellie")
eric = Elephant("Eric")
reese = Rhino("Reese")
rick = Rhino("Rick")
#Creating an
AnimalList = []
AnimalList.extend((carla, chloe, tony, tim, leo, louis, wally, warwick, henry, happy, ellie, eric, reese, rick))

khoa = Zookeeper()
khoa.wakeAnimals(AnimalList)
khoa.rollCall(AnimalList)
khoa.feedAnimals(AnimalList)
khoa.exerciseAnimals(AnimalList)
khoa.shutDown(AnimalList)
