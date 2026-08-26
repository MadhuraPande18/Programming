def checkEven(No):
    return (No%2==0)

def main():
    print("enter input")
    value=int(input())
    
    Ret=checkEven(value)

    if(Ret==True):
        print("its even")
    else:
        print("its odd")

if(__name__=="__main__"):
    main()

#short code