import threading

iCnt = 0

def Update():
    global iCnt 

    for _ in range(200000): #mla local variable nko hota pn loop fribaychay mhnun local var(i) chya jagi _ vaprl
        iCnt += 1



if __name__ == "__main__":
    iCnt = 0

    t1 = threading.Thread(target= Update)
    t2 = threading.Thread(target= Update)

    t1.start()
    t2.start()

    print("Value if iCnt is:",iCnt)