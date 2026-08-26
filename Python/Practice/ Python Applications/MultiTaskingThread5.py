import threading

def Display():
    print("Inside Display Function :",threading.get_ident()) # 2
    for i in range(5):
        print("Inside Display") #3.
def main():
    print("Inside Main",threading.get_ident())      #1.

    t1 = threading.Thread(target=Display)
    t1.start()
   
    t2 = threading.Thread(target=Display)
    t2.start()

    t1.join()
    t2.join()

    print("End of Main")  #end of the programme this will wait till t ch kam sampat nahi

if __name__ == "__main__":
     main()

#child threads==2 t1,t2
#parent thread=1