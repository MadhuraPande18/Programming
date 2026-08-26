import time
import datetime

import schedule

def fun():
    print("Inside fun at : ",datetime.datetime.now())

def main():
    print("Inside Marvellous Automation script at : ",datetime.datetime.now())

    schedule.every(20).seconds.do(fun)

    while True:  #joparynt true aahe toparyt chalat raaha
        schedule.run_pending()   #rahila asel kahi tr
        time.sleep(1)            #1 second zop
    
if __name__ == "__main__":
    main()