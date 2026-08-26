CheckEven = lambda No : (No % 2 == 0)

def main():
    Value=0
    Ret=0

    print("enter the number:")
    Value=int(input())

    Ret = CheckEven(Value)

    if(Ret == True):
        print("It is Even")
    else:
        print("It is Odd")
    
if __name__ == "__main__":
    main()
