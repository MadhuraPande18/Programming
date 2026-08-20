//toggle the position

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo,UINT iPos)
{
    UINT iMask = 0x1;
    UINT iResult=0;

    if(iPos<1 || iPos>32)
    {
       printf("Invalied bit position");
       return iNo;
    }
    iMask=iMask<<(iPos-1);
    iResult=iNo ^ iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0x1;
    UINT ilocation=0;

    printf("Enter number:\n");
    scanf("%u", &iValue);

    printf("Enter the bit position:\n");
    scanf("%u", &ilocation);

    iRet = ToggleBit(iValue,ilocation);

    // Toggle the bit

    printf("Updated number: %u\n", iRet);

    return 0;
}