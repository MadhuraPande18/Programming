def display(a, b, c, d):
    print(a, b, c, d)

def main():
    #display(10, 20)          #not allowed --> less arguments
   # display(10,20,30,40,50)  #not allowed-->extra arguments
    display(10,20,30,40)      #allowed   

if __name__ == "__main__":
    main()