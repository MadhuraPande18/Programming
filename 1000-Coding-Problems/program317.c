//dynamic mask
//check wheather the bit(dynamic) at given bit is on or off
//total final bits are always 32

typedef unsigned int UINT;       
#include<stdio.h>

int main()
{
    UINT No = 0;
    UINT iMask=0x1;   //0x is just hexadecimal indication  
    UINT iAns=0;
    UINT iPosition=0;   //position of bit u want

    printf("Enter number:\n");
    scanf("%d", &No);
    
    printf("Enter the position:\n");
    scanf("%d", &iPosition);

    iMask=iMask<<iPosition-1;   //<< is shift that bit to left from end to start direction
    iAns=No&iMask;

    if(iAns==iMask)
    {
        printf(" bit is on");
    }

    else
    {
        printf(" bit is off");
    }


    return 0;
}