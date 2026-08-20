#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo, UINT iPos)
{
    UINT iMask = 0x1;
    UINT iResult = 0;

    if(iPos < 1 || iPos > 32)
    {
        printf("Invalid bit position\n");
        return iNo;
    }

    iMask = iMask << (iPos - 1);

    // Toggle the bit
    iResult = iNo ^ iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;
    UINT iLocation = 0;

    printf("Enter number:\n");
    scanf("%u", &iValue);

    printf("Enter the bit position:\n");
    scanf("%u", &iLocation);

    iRet = ToggleBit(iValue, iLocation);

    printf("Updated number: %u\n", iRet);

    return 0;
}