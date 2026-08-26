import time
import datetime

import schedule

def fun():
    print("Inside fun at : ",datetime.datetime.now())

def gun():
    print("Inside gun at : ",datetime.datetime.now())

def main():
    print("Inside Marvellous Automation script at : ",datetime.datetime.now())

    schedule.every(1).minute.do(fun)        #this says after every 1 min..fun function run kr
    schedule.every(1).hour.do(gun)          #this says after every 1 hour gun function run kr
    while True:  #joparynt true aahe toparyt chalat raaha
        schedule.run_pending()   #rahila asel kahi tr run kr
        time.sleep(1)            #1 second zop
    
if __name__ == "__main__":
    main()