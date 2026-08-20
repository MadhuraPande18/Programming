//accept number from user and checs on or off


typedef unsigned int UINT;      
#include<stdio.h>

int main()
{
    UINT No = 0;
    UINT iMask=0x00010000;      
    UINT iAns=0;

    printf("Enter number:\n");
    scanf("%d", &No);
    iAns=No&iMask;

    if(iAns==iMask)
    {
        printf("17th bit is on");
    }

    else
    {
        printf("17th bit is off");
    }


    return 0;
}