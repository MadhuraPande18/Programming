class Demo:
    No=10   #class variable

    def __init__(self,A,B):     #parameterized constructor init is instance method
        self.value1 = A         #value1,value2=instance variables
        self.value2 = B

    def fun(self):      #self-->instance
        print('inside instance method fun')

    #decorators in python-->@ special car
    @classmethod
    def sun(cls):
        print("inside instance mathod sun",cls.No)

Demo.sun()      #this is class method
print("Class variable no:",Demo.No)

obj=Demo(11,21)

print("Instance variable:",obj.value1,obj.value2)