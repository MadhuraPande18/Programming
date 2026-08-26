class Demo:
    No = 10

    def __init__(self,A,B):
        self.value1 = A
        self.value2 = B 

    def fun(self):
        print("Inside instance method Fun : ",self.value1,self.value2)
    
    @classmethod    
    def sun(cls):
        print("Inside class method sun : ",cls.No)

    @staticmethod   #its optional decorator but we have to give the decorator
    def gun():
        print("Inside Static Method Gun")
        
Demo.sun()
print("class variable No : ",Demo.No)

class Demo:
    No = 10

    def __init__(self,A,B):
        self.value1 = A
        self.value2 = B 

    def fun(self):
        print("Inside instance method Fun : ",self.value1,self.value2)
    
    @classmethod    
    def sun(cls):
        print("Inside class method sun : ",cls.No)

    @staticmethod   #its optional decorator but we have to give the decorator
    def gun():
        print("Inside Static Method Gun")
        
Demo.sun()
print("class variable No : ",Demo.No)

obj = Demo(11,21)

obj.fun()
print("Instance Variable : ",obj.value1,obj.value2)
Demo.gun() #static method hi class name ne call hote 

#instance methods can call/ acees instance as well as class variable
#class method can only access class variables