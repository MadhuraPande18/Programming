def Outer():
    print("Inside phynix")

    def INNER():
       print("Inside zara")

def main():
    Outer()
    INNER()     #error

main()

# nested 
#defining one function inside another function
#first call outer then inner

