class Demo:
    No=10   #class variable

    def __init__(self,A,B):     #parameterized constructor init is instance method
        self.value1 = A         #value1,value2=instance variables
        self.value2 = B

print("Class variable:",Demo.No)  #classname.class var  

obj1=Demo(11,21)    #11-->A  12-->B

obj2=Demo(51,101)  #51-->A 101-->B

print("Instance variable of obj1:",obj1.value1,obj1.value2) #11,21
print("Instance variable of obj1",obj2.value1,obj2.value2)  #51,101

print(obj1.No)      #10 class variable
obj1.value1=15      #instance variable
Demo.No=0

print("Instance variable of obj1:",obj1.value1,obj1.value2) #15,21
print("Instance variable of obj2:",obj2.value1,obj2.value2) #51,101

print(obj1.No)      #0
print(obj2.No)      #0
