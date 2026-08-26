import gc

class Demo:
    No1=10
    No2=11

    def __init__(self):
        print("Inside Constructor")

    def __del__(self):
        print("Inside Destructor")

print(Demo.No1)     #Class chya navane call kele 
print(Demo.No2)