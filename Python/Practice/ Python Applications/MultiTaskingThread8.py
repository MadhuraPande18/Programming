import threading

#Parameter Passing technique 
def Display(No):
     print("Inside Display",No)

     #11 through thread No madhe aala
     
def main():
    t = threading.Thread(target=Display, args=(11,)) 
    #keyword argument (Passing tuple args as arument  to the callback function )
    #(, is compulsory mhnje jr hya tuple mdhe kahi aal tr te tyachya pudhe yeil)
    t.start()

if __name__ == "__main__":
     main()