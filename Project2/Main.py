'''
  Team Members: Justin Vuong, Sabrina Touch, Andy Kim
'''
import random
#import strategy pattern methods from Strategy.py
from Strategy import strollingStrategy
from Strategy import dashingStrategy
from Strategy import lumberingStrategy

stroll = strollingStrategy()
dash = dashingStrategy()
lumber = lumberingStrategy()
# -------------------------- Animal --------------------------
class Animal:
    def __init__(self, name, type, roam_strategy):
        self.name = name
        self.type = type
        self._roam_strategy = roam_strategy

    # Sleep method
    def sleep(self):
        print("Goes to sleep")

    # Eat method
    def eat(self):
        print("Eats")

    # Wake up method
    def wakeUp(self):
        print("Wakes Up")

    # Roam method
    # HERE IS WHERE STRATEGY IS IMPLEMENTED
    def roam(self):
        self._roam_strategy.roam()

    # Make noise method
    def makeNoise(self):
        print("Animal Noises")

# -------------------------- Second Level of Inheritance --------------------------
#USES THE STRATEGY PATTERN FOR ALL THE ANIMALS ROAM METHODS
class Feline(Animal):
    def __init__(self, name):
        super().__init__(name, "Feline", stroll)

class Canine(Animal):
    def __init__(self, name):
            super().__init__(name, "Canine", dash)


class Pachyderm(Animal):
    def __init__(self, name):
        super().__init__(name, "Pachyderm", lumber)

    def makeNoise(self):
        print("Trumpets")

# -------------------------- Third Level of Inheritance --------------------------
class Cat(Feline):
    def __init__(self, name):
        super().__init__(name)

      #Each of these methods use the randomAction method to randomize the cat's actions
    def sleep(self):
        action = random.randint(0, 5)
        print(self.randomAction(action))

    def eat(self):
        action = random.randint(0, 5)
        print(self.randomAction(action))

    def wakeUp(self):
        action = random.randint(0, 5)
        print(self.randomAction(action))

    def roam(self):
        action = random.randint(0, 5)
        print(self.randomAction(action))

    def makeNoise(self):
        action = random.randint(0, 5)
        print(self.randomAction(action))

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
        print("Rawrs")

class Lion(Feline):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        print("Roars")

class Wolf(Canine):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        print("Howls")

class Dog(Canine):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        print("Barks")

class Hippo(Pachyderm):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        print("Wheezes")

class Elephant(Pachyderm):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        print("Trumpets")

class Rhino(Pachyderm):
    def __init__(self, name):
        super().__init__(name)

    def makeNoise(self):
        print("Grunts")

# -------------------------- Third Level of Inheritance --------------------------

#Observer pattern applied.
#Zookeeper serves as a publisher for ZooAnnouncer.
#Zookeeper is capable of having multiple observers,
#but for simplicity of this assignment we will have
#one ZooAnnouncer.
class Zookeeper:
    #Set of observers.
    def __init__(self):
        self.subscribers = set()
    #Register subscribers.
    def register(self, announcer):
        self.subscribers.add(announcer)
    #Remove subscribers.
    def unregister(self, announcer):
        self.subscribers.discard(announcer)
    #Send message to the ZooAnnouncer.
    def announce(self, message):
        for subscriber in self.subscribers:
            subscriber.update(message)


    #Waking up all animals
    def wakeAnimals(self, list):
        #print("Zookeeper wakes up animals\n")
        for i in range(len(list)):
            currAnimal = AnimalList[i]
            print(currAnimal.name + ",\n " + currAnimal.type + ", " )
            currAnimal.wakeUp()
            print()
        print()
    #Roll calling all animals
    def rollCall(self, list):
        #print("Zookeeper roll calls animals\n")
        for i in range(len(list)):
            currAnimal = AnimalList[i]
            print(currAnimal.name + ", \n" + currAnimal.type + ", " )
            currAnimal.makeNoise()
            print()
        print()
    #Feed the animals
    def feedAnimals(self, list):
        #print("Zookeeper feeds animals\n")
        for i in range(len(list)):
            currAnimal = AnimalList[i]
            print(currAnimal.name + ", \n" + currAnimal.type + ", ")
            currAnimal.eat()
            print()
        print()
    #Exercise all the animals
    def exerciseAnimals(self, list):
        #print("Zookeeper exercise animals\n")
        for i in range(len(list)):
            currAnimal = AnimalList[i]
            print(currAnimal.name + ", \n" + currAnimal.type + ", ")
            currAnimal.roam()
            print()
        print()
    #Shut down the zoo
    def shutDown(self, list):
        #print("Zookeeper shuts down the zoo\n")
        for i in range(len(list)):
            currAnimal = AnimalList[i]
            print(currAnimal.name + ", \n" + currAnimal.type + ", " )
            currAnimal.sleep()
            print()
        print()

#Observer pattern applied.
#Observer class of Zookeeper.
class ZooAnnouncer:
    #ZooAnnouncer will announce a message depending on
    #The ZooKeeper's actions.
    def update(self, message):
        if message == "Wake Up":
            print("Hi, this is the zoo announcer. The zookeeper is about to wake up the animals." + "\n")
        elif message == "Roll Call":
            print("Hi, this is the zoo announcer. The zookeeper is about to roll call the animals." + "\n")
        elif message == "Feed":
            print("Hi, this is the zoo announcer. The zookeeper is about to feed the animals." + "\n")
        elif message == "Exercise":
            print("Hi, this is the zoo announcer. The zookeeper is about to exercise the animals." + "\n")
        elif message == "Shut Down":
            print("Hi, this is the zoo announcer. The zookeeper is about to shut down the zoo." + "\n")
        else:
            pass

# -------------------------- Instantiation and Calls --------------------------
carla = Cat("Carla")
chloe = Cat("Chloe")
tony = Tiger("Tony")
tim = Tiger("Tim")
leo = Lion("Leo")
louis = Lion("Louis")
wally = Wolf("Wally")
warwick = Wolf("Warwick")
doug = Dog("Doug")
dennis = Dog("Dennis")
henry = Hippo("Henry")
happy = Hippo("Happy")
ellie = Elephant("Ellie")
eric = Elephant("Eric")
reese = Rhino("Reese")
rick = Rhino("Rick")

#Creating a list of animal objects
AnimalList = []
AnimalList.extend((carla, chloe, doug, dennis, tony, tim, leo, louis, wally, warwick, henry, happy, ellie, eric, reese, rick))

#Instantiate Zookeeper and its subscriber. (ZooAnnouncer)
khoa = Zookeeper()
announcer = ZooAnnouncer()

#Register the observer.
khoa.register(announcer)

#Application of observer class.
khoa.announce("Wake Up")
khoa.wakeAnimals(AnimalList)

khoa.announce("Roll Call")
khoa.rollCall(AnimalList)

khoa.announce("Feed")
khoa.feedAnimals(AnimalList)

khoa.announce("Exercise")
khoa.exerciseAnimals(AnimalList)

khoa.announce("Shut Down")
khoa.shutDown(AnimalList)

#Remove observer from subscribers list.
khoa.unregister(announcer)
