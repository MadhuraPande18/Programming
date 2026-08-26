import threading

def SumEven(No):
    sum =0
    for i in range (2,No+1,2):
        sum = sum + i

    print("Even Sum is : ",sum)

def SumOdd(No):
    sum =0
    for i in range (1,No+1,2):
        sum = sum + i

    print("Odd Sum is : ",sum)
     
def main():
    print(SumEven(10))
    print(SumOdd(10))

    print("End of main")
if __name__ == "__main__":
     main()