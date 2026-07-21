#include<stdio.h>

int CalculateTicketPrice(int iAge)
{
    //input updater
    if(iAge<0)
    {
        iAge=-iAge;  //ex.-32=--32=32
    }
    if(iAge>=0 && iAge<=5)
    {
        return 0;
    }

    else if(iAge>=16 && iAge<=18)
    {
        return 500;
    }

    else if(iAge>=19 && iAge<=55)
    {
        return 900;
    }

    else
    {
        return 400;
    }
    

}

int main()
{
    int iValue=0;  //to store age
    int iRet=0;    //return
    
    printf("Please enter your age to calculate ticket price:");
    scanf("%d",&iValue);
    iRet=CalculateTicketPrice(iValue);

    printf("your ticket price will be %d rupees\n",iRet);
    return 0;
}