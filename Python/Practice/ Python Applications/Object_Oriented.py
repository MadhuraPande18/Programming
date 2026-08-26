#ObjectOrianted ->  
# convert all java codes in python # MIMP
# convert all python codes in 3 ways expect functional n
class Arithmetic : 
    def Addition(self,A,B):
        return A+B

    def Subtraction(self,A,B):
        return A-B


No1 = 0
No2 = 0
Ans = 0

No1 = int(input("Enter First Number : "))
No2 = int(input("Enter First Number : "))

Ans = Arithmetic().Addition(No1,No2)
print("Addition is : ",Ans)

Ans = Arithmetic().Subtraction(No1,No2)
print("Subtraction is : ",Ans)