def Summation(Arr):
    Sum=0

    for i in range(len(Arr)):
        Sum=Sum+Arr

    return Sum

def main():
    size=0
    value=0
    Ret=0

    print("enter the number of elements:")
    Size=int(input())

    Data=list()

    print("Enter the elements:")

    for i in range(size):
        value=int(input())
        Data.append(Value)

    Ret=Summation(Data)
    print("Summation is : ",Ret)
    
if __name__ == "__main__":
    main()