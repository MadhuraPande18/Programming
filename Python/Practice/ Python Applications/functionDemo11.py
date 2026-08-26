# nested 
#defining one function inside another function
#first call outer then inner

def Outer():
    print("Inside phynix")

    def INNER():
       print("Inside zara")

def main():
    Outer()

main()
