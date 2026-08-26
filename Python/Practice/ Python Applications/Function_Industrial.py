def CheckEven(iNo):
    if(iNo%2==0):
        return True
    else:
        return False

def main():
    Value=0
    iRet=False

    print("Enter the number")
    Value=int(input())

    iRet=CheckEven(Value)

    print(iRet)

if(__name__ == "__main__"):
    main()