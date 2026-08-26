import gc

class Demo:
    #class Variable
    No1 = 10    
    No2 = 11

    def __init__(self): 
        #instance Variable
        self.A = 101
        self.B = 201
        print("Inside Constructor")

    def __del__(self):
        print("Inside Destructor")

#calling class variables
print(Demo.No1)     #Class chya navane call kele 
print(Demo.No2)


#calling instance variables
obj = Demo      #object bnvla
print(obj.A)    #instance variable ahe 
print(obj.B)    #mhnun ch object ne call kele