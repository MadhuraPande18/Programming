import threading

def Display():
    for i in range(10):
        print("Inside Display : ",threading.get_ident())
def main():
    print("Inside Main : ",threading.get_ident())

    t1 = threading.Thread(target=Display)
    t1.start()
     
    t2 = threading.Thread(target=Display)
    t2.start()
   
    t1.join()#apan main la sangtoy t navacha thread sampat nahi tovr thamb
    t2.join()#apan main la sangtoy t navacha thread sampat nahi tovr thamb

    print("End of Main")

if __name__ == "__main__":
     main()