#one function can call another function

def Fun():
    print("Inside fun")

def Gun():
    print("Inside gun")
    Fun()

def main():
 Gun()

main()


