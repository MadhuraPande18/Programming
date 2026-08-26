def ChkDivisible():

    val=int(input("Enter the num:"))

    if(val%3==0) and (val%5==0):

        return True
    else:
        return False

print(ChkDivisible())