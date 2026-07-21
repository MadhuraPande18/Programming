#include<stdio.h>

void CheckEvenOdd(int iNo)
{
    int iRem=0;
    iRem=iNo%2;
    if(iRem==0)
    {
        printf("Number is even\n");
    }

    else
    {
        printf("Number is odd\n");
    }
    
}
int main()  //program execution will start
{
    int iValue=0;
    printf("Enter Number\n");
    scanf("%d",&iValue);
    CheckEvenOdd(iValue);
    return 0;
}
