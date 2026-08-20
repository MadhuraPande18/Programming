//accept number from user and check 13th bit is on or off


typedef unsigned int UINT;      
#include<stdio.h>

int main()
{
    UINT No = 0;
    UINT iMask=0x1000;      //no value of left side 0 <--- this side
    UINT iAns=0;

    printf("Enter number:\n");
    scanf("%d", &No);
    iAns=No&iMask;

    if(iAns==iMask)
    {
        printf("13th bit is on");
    }

    else
    {
        printf("13 th bit is off");
    }


    return 0;
}