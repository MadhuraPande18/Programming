#include<stdio.h>
#include<stdbool.h>

 bool CheckEvenOdd(int iNo)
{
    int iRem=0;

    iRem=iNo%2;

    if(iRem==0)
    {
        return true;
    }

    else
    {
        return false;
    }
    
}
int main()  //program execution will start
{
    int iValue=0;
    bool bRet=false; //false means internally 0 and true is 1
    printf("Enter Number to check whether its even or odd\n");
    scanf("%d",&iValue);
    bRet=CheckEvenOdd(iValue);

    if(bRet==true)
    {
        printf("Number is even\n");
    }

    else{
        printf("Number is odd\n");
    }
    return 0;
}
