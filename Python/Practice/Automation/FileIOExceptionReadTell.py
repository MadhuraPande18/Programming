def main():

    try:
        fobj = open("Hello.txt","r")

        print("File gets sucessfully opened")
        
        print("Current offset is : ",fobj.tell())   #0

        Data = fobj.read(6) 

        print("Current offset is : ",fobj.tell())   #6  tells kuthe aahe sadhys

        print("Data from file is : ",Data)

        fobj.close()

    except FileNotFoundError:
        print("Unable to open file as there is no such file")
    
    finally:
        print("End of Exception")

if __name__ == "__main__":
    main()