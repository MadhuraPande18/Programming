import threading

iCnt = 0

def Update():
    global iCnt 

    for _ in range(2000000): #mla local variable no hota pn loop fribaychay mhnun local var(i) chya jagi _ vaprl
        iCnt = iCnt + 1

def main():
    global iCnt

    Update() #op: 2 lakh
    Update() #op: 4 lakh

    print("Value of iCnt is : ",iCnt)


if __name__ == "__main__":
    main()