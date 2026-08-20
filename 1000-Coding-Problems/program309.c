//checkwheather last 3rd bit is On(1)or off(0)
//ex.11001010
//hereclast 3rd bit out of 32 total bits is 0 i.e.off

#include<stdio.h>

int main()
{
    unsigned No = 0;
    unsigned iMask=4;    //last 3rd  bit means decimal is 4 number
                        //mask only shows wanted part
    unsigned iAns=0;

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