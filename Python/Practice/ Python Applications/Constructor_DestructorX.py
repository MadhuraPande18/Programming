import gc

class Demo:
    def __init__(self):
        print("Inside constructor")

    def __del__(self):
        print("inside destructor")

#allocate
obj1=Demo()
obj2=Demo()

#use

#deallocate
del obj1        #its not destructor its free in c
del obj2

gc.collect()    #just like system.gc in java

print("End of the application")


