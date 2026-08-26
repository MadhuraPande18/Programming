#procedural

def checkEven(No):
    if(No%2==0):
        print("even")

    else:
        print('Odd')

def main():
    print("Enter number")
    Value=int(input())

    checkEven(Value)

if __name__ == "__main__":
    main()
    
