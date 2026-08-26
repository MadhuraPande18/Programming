#lock wala code

import threading

iCnt=0
lobj=threading.Lock()  #lock cha object=iobj,LOCK() is class
def update():
    global iCnt

    for _ in range(200000):
        with lobj: #ithe lock lawala
            iCnt=iCnt+1

def main():
    global iCnt

    t1=threading.Thread(target=update)
    t2=threading.Thread(target=update)

    t1.start()
    t2.start()

    t1.join()
    t2.join()

    print("value of iCnt is:",iCnt)

if __name__=="__main__":
    main()