#include<stdio.h>

 int CheckEvenOdd(int iNo)
{
    int iRem=0;
    iRem=iNo%2;
    if(iRem==0)
    {
        printf("%d is even\n",iNo);
    }

    else
    {
        printf("%d is odd\n",iNo);
    }
    
}
int main()  //program execution will start
{
    int iValue=0;
    int iRet=0;
    printf("Enter Number to check whether its even or odd\n");
    scanf("%d",&iValue);
    iRet=CheckEvenOdd(iValue);

    if(iRet==0)
    {
        printf("Number is even\n");
    }

    else{
        printf("Number is odd\n");
    }
    return 0;
}
