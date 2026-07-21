#include<stdio.h>

//user defined macro
#define AGE_INVALID -1

int CalculateTicketPrice(int iAge)
{
    //input filter
    if(iAge<0)
    { 
        return AGE_INVALID;
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
    iRet=

    if(iRet==-1)
    {
        printf("Please enter positive age\n");
    }

    printf("your ticket price will be %d rupees\n",iRet);
    return 0;
}