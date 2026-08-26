import threading

#Parameter Passing technique 
def Display(No1,No2,No3):
     print("Inside Display",No1,No2,No3)

     #11 through thread No madhe aala
     
def main():
    t = threading.Thread(target=Display, args=(11,21,51,)) 
    #keyword argument (Passing tuple args as arument  to the callback function )
    #(, is compulsory mhnje jr hya tuple mdhe kahi aal tr te tyachya pudhe yeil)
    t.start()

if __name__ == "__main__":
     main()