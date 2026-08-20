//checkwheather last 3rd bit is On(1)or off(0)
//ex.11001010
//hereclast 3rd bit out of 32 total bits is 0 i.e.off


typedef unsigned int UINT;      //like import numpy as np (short form)
                                //typedef==means define type (self declared to shorten name)

#include<stdio.h>

int main()
{
    UINT No = 0;
    UINT iMask=4;    
    UINT iAns=0;

    printf("Enter number:\n");
    scanf("%d", &No);
    iAns=No&iMask;

    if(iAns==iMask)
    {
        printf("3 rd bit is on");
    }

    else
    {
        printf("3 rd bit is off");
    }


    return 0;
}