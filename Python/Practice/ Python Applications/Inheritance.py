class Parent:
    def __init__(self):
        print("Inside parent constructor")
        self.No1=10
        self.No2=20

    def fun(self):      
        print("Inside fun method of parent")

class Child(Parent):
    def __init__(self):
        super().__init__() #access to parent class methods and var
        print("Inside child constructor")
        self.A = 11 #instance var
        self.B = 21

    def sun(self):
        print("Inside sun method of child")
         #child has two methods fun and sun

cobj = Child()

#self-->swatacha data access
#super-->swata ch pn,parent ch pn acees kru shakto
