#importing Python's built in abstract class library
import abc

class roamStrategy(object):
    #Defining an abstract class
    __metaclass__ = abc.ABCMeta

     #@abc.abstractmethod
    def roam(self):
         """Required Method"""

class strollingStrategy(roamStrategy):
    def roam(self):
        print("Strolls Around")

class dashingStrategy(roamStrategy):
    def roam(self):
        print("Dashes Around")

class lumberingStrategy(roamStrategy):
    def roam(self):
        print("Lumbers Around")
