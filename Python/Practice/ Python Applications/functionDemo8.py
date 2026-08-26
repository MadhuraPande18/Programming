# Return multiple values
def Marvellous1(Value1, Value2):
    return 11, 21, 51

def main():

    Result1 = None
    Result2 = None
    Result3 = None

    Result1, Result2, Result3 = Marvellous1("python", 21)

    print("Return Values are:", Result1, Result2, Result3)

main()

