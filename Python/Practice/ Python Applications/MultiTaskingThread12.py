import threading
import time

def SumEven(No):
    sum =0
    for i in range (2,No+1,2):
        sum = sum + i

    print("Even Sum is : ",sum)

def SumOdd(No):
    sum =0
    for i in range (1,No+1,2):
        sum = sum + i

    print("Odd Sum is : ",sum)
     
def main():

    start_time=time.time()
    t1=threading.Thread(target=SumEven,args=(10000000,))
    t2=threading.Thread(target=SumOdd,args=(10000000,))

    t1.start()
    t2.start()

    t1.join()   #waits for t1 to end
    t2.join()   #waits for t2 to end and finish whole work

    end_time = time.time()

    print("Time required :",end_time-start_time)


    print("End of main")

    # yat (python) main thread jr child thread chya aadhi mela tr child thread ha mrt nhi to chaluch asto
if __name__ == "__main__":
     main()