/*
    //Start
        Accept number as No
        If No is completely divisible by 2 
            then print Even
        Othervise
            print odd
    //Stop

    Start
        Accept number as No
        Divide No by 2
        If remainder is 0 
            then print even
        Otherwise 
            print odd

    Stop
*/

#include<stdio.h>
int main()
{
    int iValue=0;
    int iRem=0;
    iRem=iValue%2;
    if(iRem==0)
    {
        printf("Number is even\n");
    }

    else
    {
        printf("Number is odd\n");
    }
    printf("Enter Number\n");
    scanf("%d",&iValue);

    return 0;
}
