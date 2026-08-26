def main():
    Size=0
    Value=0

    print("Enter the number of elements:")
    Size=int(input())   #stored in size

    Data=list()     #we created object of class list
    print("Enter the elements:")

    for i in range(Size):   #range=from 0 to Size-1
        Value=int(input())
        Data.append(Value)      #add

    Sum=0
    for i in range(Size):
        Sum=Sum+Data[i]

    print("Summation is:",Sum)

if __name__ == "__main__":
    main()