import gc

class Demo:
    def __init__(self):
        print("Inside Constructor")

    def __del__(self):
        print("Inside Destructor")

#Allocate    
obj = Demo()

#Use

#Deallocate
del obj #ha del keyword is like free in c ha del mhnje to distructor vala del nahi

gc.collect()    #just like system.gc in java

print("End of Application")