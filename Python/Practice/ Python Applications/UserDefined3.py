def Multiplication(Value1,Value2):  #indentation
    Ans=0
    Ans=Value1*Value2
    return Ans

def main():         #indentation
    No1=0
    No2=0
    result=0

    No1=int(input("enter first number:"))
    No2=int(input("Enter second number:"))

    result=Multiplication(No1,No2)
    print("Multiplication is : ",result)

main() #called main function

#here both main()and Multiplication() are user defined functiond