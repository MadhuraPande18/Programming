import os

def main():
    FileName=input("Enter the name of the file:")

    if(os.path.exists(FileName)):
        fobj=open(FileName,"r")

        print(fobj.name)    #demo.txt
        print(fobj.mode)    #R
        print(fobj.closed)  #false

        fobj.close()
        print(fobj.close)   #true

    else:
        print("There is no such a file")

if __name__== "__main__":
    main()