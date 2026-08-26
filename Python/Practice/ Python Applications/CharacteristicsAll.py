class Demo:
    No=10   #class variable

    def __init__(self,A,B):     #parameterized constructor init is instance method
        self.value1 = A         #value1,value2=instance variables
        self.value2 = B

print("Class variable:",Demo.No)  #classname.class var  

obj1=Demo(11,21)    #11-->A  12-->B

obj2=Demo(501,101)  #501-->A 101-->B

print("Instance variable of obj1:",obj1.value1,obj1.value2)
print("Instance variable of obj1",obj2.value1,obj2.value2)

